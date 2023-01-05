package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchRakesh {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		WebElement pass= driver.findElement(By.name("user_password"));
		pass.sendKeys("admin");
		
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("campaignname")).sendKeys("Rakesh");
		driver.findElement(By.id("targetaudience")).sendKeys("250");
		driver.findElement(By.id("sponsor")).sendKeys("Ramkumar");
		driver.findElement(By.id("numsent")).sendKeys("50");
		driver.findElement(By.id("targetsize")).sendKeys("4");
		WebElement Cost= driver.findElement(By.id("budgetcost"));
		Cost.clear();
		Cost.sendKeys("500");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Clock.gif']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='themes/images/close.gif']")).click();
		driver.close();
	}

}
