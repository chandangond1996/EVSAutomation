import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandelToday {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		WebElement marketing = driver.findElement(By.className("tabUnSelected"));

		Actions act = new Actions(driver);
		act.moveToElement(marketing).build().perform();

		WebElement lead = driver.findElement(By.linkText("Leads"));
		act.sendKeys(lead, Keys.ENTER).perform();

		WebElement watchDrag = driver.findElement(By.xpath("//img[@title='Show World Clock...']"));
		// WebElement clickanddrag=driver.findElement(By.id("425"));
		act.doubleClick(watchDrag).dragAndDropBy(watchDrag, 100, 150).perform();

		driver.quit();
	}

}
