package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Palindrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://chromedriver.chromium.org/downloads");
//		driver.findElement(By.xpath("//a[text()='ChromeDriver 110.0.5481.30']")).click();
//		String strTitle = driver.getTitle();
//		Set<String> setWindH = driver.getWindowHandles();
//		for (String object : setWindH) {
//			driver.switchTo().window(object);
//			if(strTitle.equalsIgnoreCase("ChromeDriver - WebDriver for Chrome - Downloads")==false) {
//				break;
//			}
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		driver.get("http://localhost:8888");
		Actions ac= new Actions(driver);
		ac.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).perform();
		driver.findElement(By.linkText("Marketing")).click();
		
		driver.findElement(By.linkText("Documents")).click();
		boolean select=driver.findElement(By.xpath("//input[@id=\"440\"]")).isSelected();
		if(select==true) {
			System.out.println("check Box is Select");
		}else {
			System.out.println("check Box is not Select");
		}
		
		
	}

}
