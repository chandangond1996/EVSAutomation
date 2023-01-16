package SeliniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import evs2.Code.Array_List;

public class MousOver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		Actions objActions = new Actions(driver);
		WebElement weObj = driver.findElement(By.linkText("Marketing"));
		objActions.moveToElement(weObj).build().perform();
		WebElement weClickLeads = driver.findElement(By.linkText("Leads"));
		objActions.sendKeys(weClickLeads, Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement weWatch = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Clock.gif']"));
		WebElement weLocation = driver.findElement(By.xpath("//a[text()='My Preferences']"));
		objActions = new Actions(driver);
//		objActions.moveToElement(weWatch).click().clickAndHold().moveToElement(weLocation).build().perform();
//		Thread.sleep(1000);		objActions = new Actions(driver);
//		objActions.moveToElement(driver.findElement(By.id("339"))).build().perform();
//		Thread.sleep(1000); 		objActions = new Actions(driver);
//		objActions.moveToElement(driver.findElement(By.xpath("//b[text()='World Clock']")), 50, 20).build().perform();
//		objActions.release(weWatch).perform();
		objActions.sendKeys(weWatch, Keys.ENTER).dragAndDrop(weWatch, weLocation).perform();
		objActions.sendKeys(driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")))
				.doubleClick().perform();
		objActions.moveToElement(driver.findElement(By.xpath("//input[@name='firstname']"))).click().sendKeys("Ram")
				.moveToElement(driver.findElement(By.name("lastname"))).click().sendKeys("Kumar").perform();
		// Thread.sleep(2000);
		objActions.click(driver.findElement(By.xpath("//img[@title='Open All Menu...']"))).clickAndHold().perform();

		
	}

}
