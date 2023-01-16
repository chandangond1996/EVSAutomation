package SeliniumPractice.WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].value='admin'", driver.findElement(By.xpath("//input[@name='user_name']")));
		jsObj.executeScript("arguments[0].value='admin';", driver.findElement(By.xpath("//input[@name='user_password']")));
		jsObj.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='Login']")));
		
		jsObj.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='About Us']")));
		jsObj.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Feedback']")));
		jsObj.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Help']")));
		Set<String> handle=driver.getWindowHandles();
		for(String weHandle:handle) {
			driver.switchTo().window(weHandle);
			driver.close();
			
		}
	}

}
