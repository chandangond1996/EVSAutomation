package SeliniumPractice.WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.linkText("Help")).click();
		Set<String> getValue = driver.getWindowHandles();
		for (String string : getValue) {
			driver.switchTo().window(string);
			String getTitel = driver.getTitle();
			System.out.println(getTitel);
			if (getTitel.equalsIgnoreCase("")) {
				driver.findElement(By.name("description")).sendKeys("Hello This is good Application");
				driver.findElement(By.name("sender-email")).sendKeys("pradeepkumar@gmail.com");
			} else if (getTitel.equalsIgnoreCase("Vtiger CRM - vtiger")) {
				driver.close();
			} else if (getTitel.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
				driver.close();
			} else if (getTitel
					.equalsIgnoreCase("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM")) {

				driver.findElement(By.linkText("Marketing")).click();
			}

		}
//	getUrl();
	}

//	public static void getUrl() {
//		driver.get("http://localhost:8888");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.name("Login")).click();
//		driver.findElement(By.linkText("About Us")).click();
//		driver.findElement(By.linkText("Feedback")).click();
//		driver.findElement(By.linkText("Help")).click();
//		Set<String> getValue = driver.getWindowHandles();
//		for (String string : getValue) {
//			driver.switchTo().window(string);
//			String getUrl = driver.getCurrentUrl();
//			System.out.println(getUrl);
//			if (getUrl.equalsIgnoreCase("https://www.vtiger.com/products/crm/feedback.php?uid=1a37414be380fd0077a6dc184c6e9b62")) {
//				driver.findElement(By.name("description")).sendKeys("Hello This is good Application");
//				driver.findElement(By.name("sender-email")).sendKeys("pradeepkumar@gmail.com");
//			} else if (getUrl.equalsIgnoreCase("https://wiki.vtiger.com/index.php?title=Vtiger_CRM&redirect=no")) {
//				driver.close();
//			} else if (getUrl.equalsIgnoreCase("http://localhost:8888/index.php?module=Users&action=about_us")) {
//				driver.close();
//			} else if (getUrl
//					.equalsIgnoreCase("http://localhost:8888/index.php?action=index&module=Home")) {
//
//				driver.findElement(By.linkText("Marketing")).click();
//			}
//
//		}
//	}

}
