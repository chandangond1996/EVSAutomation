package SeliniumPractice.PopupHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupHendleAndBckFrw {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8888/");
		driver.navigate().to("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor sc=(JavascriptExecutor)driver;
		sc.executeScript("window.scrollBy(0,500);", "");
		
//		WebElement obj = driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]"));
 //		sc.executeAsyncScript("arguments[0].scrollIntoView();", obj);
//		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS );
	
//		Actions objAc = new Actions(driver);
 //		objAc.moveToElement(driver.findElement(By.linkText("Marketing"))).perform();
//		driver.findElement(By.linkText("Leads")).click();
 //		driver.findElement(By.id("420")).click();
//		driver.findElement(By.xpath("//select[@id=\"viewname\"]//parent::td//parent::tr//parent::tbody//parent::table//parent::td//preceding-sibling::td//input[@value='Delete']")).click();
 //		String actualTextOfPopup = driver.switchTo().alert().getText();
//		if (actualTextOfPopup.equalsIgnoreCase("Are you sure you want to delete the selected 1 records?")) {
 //			System.out.println("Popup Alert here");
//		} else {
 //			System.out.println("Not Alert Poput here");
//		}
 //		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
 //		driver.navigate().back();
//		driver.navigate().forward();
	}

}
