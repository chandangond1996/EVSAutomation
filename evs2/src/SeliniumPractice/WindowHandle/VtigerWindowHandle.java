package SeliniumPractice.WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VtigerWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();

		driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.linkText("Help")).click();
		Set<String> handleValue = driver.getWindowHandles();
		System.out.println(handleValue);
		for (String handle : handleValue) {
			WebDriver matchValue = driver.switchTo().window(handle);
			String getTitel = driver.getTitle();
//			System.out.println(getTitel);
			if (getTitel.equalsIgnoreCase("wiki.vtiger.com") || getTitel.equalsIgnoreCase("www.vtiger.com")) {
				driver.close();
			}
		}
	}

}
