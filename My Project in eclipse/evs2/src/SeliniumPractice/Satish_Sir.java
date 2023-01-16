package SeliniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Satish_Sir {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//a[text()='Marketing']//parent::td//img")).click();
		driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[@href='index.php?module=Leads&action=index&parenttab=Marketing']")).click();
		
		
	}

}
