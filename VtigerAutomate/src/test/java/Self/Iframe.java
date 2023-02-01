package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		Actions ac = new Actions(driver);
		ac.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).perform();
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//a[text()='Documents']")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Document...\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class=\"cke_show_borders\"]")).sendKeys("sunil kumar");
		Thread.sleep(2000);
		ac.sendKeys(driver.findElement(By.xpath("//body[@class=\\\"cke_show_borders\\\"]")),Keys.LEFT_CONTROL,"a").perform();
	}

}
