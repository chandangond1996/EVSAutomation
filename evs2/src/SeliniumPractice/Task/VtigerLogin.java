package SeliniumPractice.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
//		Actions acObj = new Actions(driver);
//		acObj.click(driver.findElement(By.xpath("//input[@name='Login']"))).perform();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].value='admin'", driver.findElement(By.xpath("//input[@name='user_name']")));
		jsObj.executeScript("arguments[0].value='admin';", driver.findElement(By.xpath("//input[@name='user_password']")));
		jsObj.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='Login']")));
		jsObj.executeScript("window.scrollBy(0,1000);", "");Thread.sleep(5000);
//		jsObj.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]")));
		jsObj.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//b[contains(text(),'Tag Cloud')]")));
	}

}
