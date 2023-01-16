package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlaySongs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Actions objAc= new Actions(driver);
		WebElement enterText=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
//		WebElement dropEnter=driver.findElement(By.xpath("//b[text()=' movie mp3 ']"));
		objAc.sendKeys(enterText, "ghar ka chirag songs").sendKeys(Keys.ENTER).build().perform();
		objAc.click(driver.findElement(By.xpath("//span[@class=\"z1asCe UIgqBe\"]"))).build().perform();
		objAc.click(driver.findElement(By.xpath("//button[@aria-label=\"Play\"]"))).perform();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		}

}
