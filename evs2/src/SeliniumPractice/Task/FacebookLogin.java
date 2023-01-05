package SeliniumPractice.Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jSE=(JavascriptExecutor)driver;
		jSE.executeScript("arguments[0].value='9598935534'", driver.findElement(By.xpath("//input[@id='email']")));
		jSE.executeScript("arguments[0].value='admin@123'", driver.findElement(By.xpath("//input[@id='pass']")));
		jSE.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@name='login']")));
		
		driver.findElement(By.xpath("//span[text()='Automation Practice']")).click();
		driver.findElement(By.xpath("//span[text()='Edit Cover Photo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Upload photo']")).click();
		StringSelection ss = new StringSelection("C:\\Users\\ADMIN\\Desktop\\Logo smart.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//span[text()='Save changes']")).click();
	}

}
