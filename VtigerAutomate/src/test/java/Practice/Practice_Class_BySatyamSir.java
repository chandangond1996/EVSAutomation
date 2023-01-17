package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Class_BySatyamSir {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/homestays/");
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='Alliance Air']//preceding-sibling::span")).click();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//label[text()='₹ 2000 - ₹ 4000']")).click();
	}

}
