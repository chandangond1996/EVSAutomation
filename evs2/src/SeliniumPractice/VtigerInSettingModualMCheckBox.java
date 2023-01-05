package SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerInSettingModualMCheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Settings']")).click();
		driver.findElement(By.xpath("//td[@class='level2SelTab']//a[text()='Module Manager']")).click();

		List<WebElement> checkCheckMarkSelectedOrNot = driver
				.findElements(By.xpath("//table[@id='modmgr_standard']//tr//td//a//img[contains(@title,'able ')]"));
		for (int i = 0; i < checkCheckMarkSelectedOrNot.size(); i++) {
			checkCheckMarkSelectedOrNot = driver.findElements(
					By.xpath("//table[@id='modmgr_standard']//tr//td//a//img[contains(@title,'able ')]"));
			WebElement weObj = checkCheckMarkSelectedOrNot.get(i);
			  String actual=weObj.getAttribute("title");			
			String expected = "Disable";
			if (actual.contains(expected)) {
				System.out.println(i+1+" :- Testing is Passed here Already Selected....");
			} else {
				weObj.click(); Thread.sleep(5000);
				System.out.println(i+1+" :- Testing is Passed(The Modul was disabled)..Now It's Enabled....");
			}
		}
	}

}
