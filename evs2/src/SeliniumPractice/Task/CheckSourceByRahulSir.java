package SeliniumPractice.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSourceByRahulSir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888");

		String getPageSource = driver.getPageSource();
//		System.out.println(getPageSource);
		driver.get("https://validator.w3.org/");
		driver.findElement(By.xpath("//a[text()=' Direct Input']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		js.executeScript("arguments[0].value='" + getPageSource + "';", driver.findElement(By.xpath("//textarea[@id='fragment']")));
//		driver.findElement(By.id("fragment")).sendKeys("ram raju kaju saju jaykishan rajaram mohan ray suran sunita ");
		driver.findElement(By.xpath("//fieldset[@id='extra_opt_direct']//following-sibling::p//a[text()='Check']")).click();

	}

}
