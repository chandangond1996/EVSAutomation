package SeliniumPractice.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FacebookCreateAcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Practice");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9935003200");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1997");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//		driver.findElement(By.xpath("//i[@class='x1b0d499 xep6ejk']")).click();
//		driver.findElement(By.xpath("//div[@class='xod5an3 x16n37ib x14vqqas x1n2onr6 xqcrz7y']")).click();
//		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
	
	}

}
