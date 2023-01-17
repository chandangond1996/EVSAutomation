package Self;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
//		Actions ac = new Actions(driver);
//		ac.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).perform();
//		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//		driver.findElement(By.xpath("//img[@src=\"themes/images/tbarImport-Faded.gif\"]")).sendKeys("ad");

		
		WebElement weObj = driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
		Select objSelect = new Select(weObj);

//		WebElement welement=objSelect.getFirstSelectedOption();
//		System.out.println(welement.getText());

		List<WebElement> listW = objSelect.getOptions();  // getOptions() method of Select class
		for (int i = 0; i < listW.size(); i++) {
			WebElement Obj = listW.get(i);
			String str=Obj.getText();
			System.out.println(str);
			if(str.equalsIgnoreCase("bluelagoon")) {
				Obj.click();
			}
		}

	}
}
