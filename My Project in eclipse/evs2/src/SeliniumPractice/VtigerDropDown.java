package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerDropDown {

	public static void main(String[] args) {
		method();
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Actions objAc = new Actions(driver);
		WebElement objWeb = driver.findElement(By.xpath("//select[@id='qccombo']"));
		objAc.sendKeys(objWeb).sendKeys(driver.findElement(By.xpath("//select[@id='qccombo']//option")), Keys.ENTER)
				.perform();
	}

	public static void method() {

		int a = 100;
		if (a > 100) {
			System.out.println("Hello");
		} else {
			System.out.println("Hello India");
		}

	}
}
