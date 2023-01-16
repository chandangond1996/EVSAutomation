package OnlineForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VitigerPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
//		options.addArguments("Headless");
		options.setHeadless(false);
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		Dimension sizeOfLoginButton = driver.findElement(By.xpath("//input[@name='Login']")).getSize();
		int getHeightOfLogin = sizeOfLoginButton.getHeight();
		int getWidthOfLogin = sizeOfLoginButton.getWidth();
		int allSize = getWidthOfLogin + getHeightOfLogin;
		System.out.println(allSize);
		if (allSize == 178) {
			System.out.println("Here is Login Button.....");
		} else {
			System.out.println("Here is not Login Button...");
		}
		driver.findElement(By.xpath("//input[@name='Login']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,500);", "");
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//td[contains(text(),'My Home Page')]")));
	}

}
