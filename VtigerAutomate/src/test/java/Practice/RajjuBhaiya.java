package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RajjuBhaiya {

	public static void main(String[] args) {
		System.out.println("10".compareTo("5"));
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://erp.prsuprayagraj.in/StuRoll_MainExam_2122.aspx");
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(text(),'B')]"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}

	}

}
