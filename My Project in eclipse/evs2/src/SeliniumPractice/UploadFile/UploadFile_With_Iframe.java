package SeliniumPractice.UploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class UploadFile_With_Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
//		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		// op.addArguments("headless");
		// op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(op);

		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		System.out.println("India");
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//td[@class='level2UnSelTab']//a[text()='Documents']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
		Select sl= new Select(driver.findElement(By.xpath("//select[@name='filelocationtype']")));
		sl.selectByIndex(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_show_borders']")).sendKeys("I am chandan");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@id='cke_56_text']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//h3[text()='Red Title']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@id='cke_57_text']")).click();
		driver.switchTo().frame("cke_68_frame");
		driver.findElement(By.xpath("//h1[text()='Heading 1']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='cke_18']")).click();
		driver.findElement(By.xpath("//a[@id='cke_48']")).click();
		WebElement row = driver.findElement(By.xpath("//input[@id='114_textInput']"));
		row.clear();
		row.sendKeys("5");
		WebElement colum = driver.findElement(By.xpath("//input[@id='117_textInput']"));
		colum.clear();
		colum.sendKeys("3");
		driver.findElement(By.xpath("//input[@id='153_textInput']")).sendKeys("My_Table");
//		try {
//			driver.findElement(By.xpath("//span[@id='163_label']")).click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		WebElement getText = driver.findElement(By.xpath("//label[text()='Rows']"));
		System.out.println(getText.getText());
		// getText.sendKeys(Keys.LEFT_SHIFT.ARROW_RIGHT);

		WebElement okBtn = driver.findElement(By.xpath("//span[@id='163_label']"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		try {
			js.executeAsyncScript("arguments[0].click();", okBtn);
		} catch (Exception i) {
			i.printStackTrace();
		}
		System.out.println("Hello");
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		WebElement text = driver.findElement(By.xpath("//h1[text()='I am chandan']"));
		System.out.println(text.getText());
		ac.doubleClick(text).click().perform();
//		text.sendKeys(Keys.LEFT_CONTROL, "a");
		driver.switchTo().defaultContent();
		WebElement weObj = driver.findElement(By.xpath("//span[@id='cke_52_label']//preceding-sibling::span"));
		ac.click(weObj).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB).perform();
		ac.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//span[@id='cke_42_label']//preceding-sibling::span")).click();
		driver.findElement(By.xpath("//a[text()='Replace']")).click();
		driver.findElement(By.xpath("//input[@id='225_textInput']")).sendKeys("I am chandan");
		driver.findElement(By.xpath("//input[@id='234_textInput']")).sendKeys("I am known as chandan");
		ac.doubleClick(driver.findElement(By.xpath("//span[@id='231_label']"))).perform();
		driver.findElement(By.xpath("//a[@id='cke_dialog_close_button_201']")).click();
		System.out.println("Replace with I am chandan to I am known as chandan");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//span[text()='I am known as chandan']")).getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//b[text()='Basic Information']//parent::td//parent::tr//preceding-sibling::tr//input[@value='  Save  ']")).click();
//		ac.sendKeys(Keys.ESCAPE).perform();
		try {
			ac.sendKeys(Keys.ENTER).perform();
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
		System.out.println("the exeception name is "+e);
		}
	}

}
