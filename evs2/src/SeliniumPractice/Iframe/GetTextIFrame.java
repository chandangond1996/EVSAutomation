package SeliniumPractice.Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextIFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://automatenow.io/sandbox-automation-testing-practice-website/iframes/");
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'automateNow')]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='I am an iframe.']")).getText());
		driver.switchTo().frame("frame1");
		System.out.println(driver
				.findElement(By.xpath("//p[text()='What you do with that power is entirely up to you.']")).getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='nav_toggle']")).click();
		WebElement weObj = driver.findElement(By.xpath("//span[text()='Sandbox']"));
		System.out.println(weObj.getAttribute("data-hover"));
		weObj.click();
		driver.navigate().back();
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//h2[text()='Getting Started']")).getText());
		List<WebElement> listObj = driver.findElements(By.xpath("//li[@class='nav-item dropdown']//a"));
		for (int i = 0; i < listObj.size(); i++) {
			System.out.println("==============================");
			System.out.println("Print all tab in iframe..");
			System.out.println(listObj.get(i).getText());
			System.out.println("==========================");
		}
		System.out.println(driver.findElement(By.xpath("//h4[text()='Selenium Conference Chicago 2023']")).getText());
		List<WebElement> lstObj = driver.findElements(By.xpath("//h4[contains(@class,'h3 mb-3 selenium')]"));
		for (int i = 0; i < lstObj.size(); i++) {
			System.out.println(lstObj.get(i).getText());
		}
	}

}
