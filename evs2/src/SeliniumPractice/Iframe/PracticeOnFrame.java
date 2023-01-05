package SeliniumPractice.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://automatenow.io/sandbox-automation-testing-practice-website/iframes/");
		String getText = driver.findElement(By.xpath("//p[text()='I am an iframe.']")).getText();
		System.out.println(getText);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		String getTextOfiframe = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]"))
				.getText();
		System.out.println(getTextOfiframe);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='nav_toggle']")).click();
		WebElement objWe = driver.findElement(By.xpath("//a[@data-hover='Training']"));
		System.out.println(objWe.getAttribute("data-hover"));
		objWe.click();
// 		System.out.println("give me exception");
//		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.xpath("//h1[text()='Training']")).getText());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		String text = driver.findElement(By.xpath("//h1[text()='Introducing Android 12.']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'automateNow')]")).getText());
	}

}
