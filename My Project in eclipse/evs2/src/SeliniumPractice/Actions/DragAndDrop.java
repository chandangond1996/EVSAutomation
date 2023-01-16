package SeliniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		Actions objActions = new Actions(driver);
		WebElement dragWatch = driver.findElement(By.xpath("//img[@title=\"Show World Clock...\"]"));
//		objActions.click(dragWatch);
		WebElement dropWatch = driver.findElement(By.xpath("//a[text()='My Preferences']"));
		objActions.click(dragWatch).dragAndDrop(dragWatch, dropWatch).build().perform();
	}

}
