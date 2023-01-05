package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FindOutColor_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
//		BackgroundColor of Delete Button 
		String colorProperties =driver.findElement(By.xpath("//input[@value='Delete']")).getCssValue("background-color");
		String s=Color.fromString(colorProperties).asHex();
		//System.out.println(s);
		if(s.equalsIgnoreCase("#ff0000")) {
			System.out.println("Testing is pass because Delete button color is Red..");
		}else {
			System.out.println("Testing is fail because Delete button color is not Red..");
		}
//		TextColor of Delete Button Text
		String colorTextProperties =driver.findElement(By.xpath("//input[@value='Delete']")).getCssValue("color");
		String cText=Color.fromString(colorTextProperties).asHex();
		//System.out.println(cText);
		if(cText.equalsIgnoreCase("#ffffff")) {
			System.out.println("Testing is pass because Delete button Textcolor is White color ..");
		}else {
			System.out.println("Testing is fail because Delete button Textcolor is not White color ..");
		}
		
		String colorSearchButton=driver.findElement(By.xpath("//input[@value=' Search Now ']")).getCssValue("background-color");
		String searchAs=Color.fromString(colorSearchButton).asHex();
		//System.out.println(searchAs);
		if(searchAs.equalsIgnoreCase("#5774b0")) {
			System.out.println("Search Button is bagroundColor of Blue.");
		}else {
			System.out.println("Search Button is not bagroundColor of Blue.");
		}
		
	}

}
