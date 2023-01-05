package SeliniumPractice.Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class AutomationPracticeByMithleshSir {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@xyz.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']//i")).click();
		driver.findElement(By.xpath("//span[text()='My wishlists']")).click();
		Actions ac=new Actions(driver);
		List<WebElement> objListWeb=driver.findElements(By.xpath("//div[@class='product-content']"));
		for (int i = 0; i < objListWeb.size(); i++) {
			objListWeb=driver.findElements(By.xpath("//div[@class='product-content']"));
			WebElement objWe= objListWeb.get(i);
			System.out.println(objWe.getText());
			ac.click(objWe).perform();
//			objWe.click();
//		String	getText=driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']")).getText();
//			System.out.println(i+1+" = "+getText);
			driver.navigate().back();
		}
	}

}
