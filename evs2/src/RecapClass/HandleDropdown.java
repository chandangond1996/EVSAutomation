package RecapClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		WebElement loginThemeDropdownObj = driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
		Select selectObj = new Select(loginThemeDropdownObj);
		selectObj.selectByValue("softed");

		WebElement a2 = selectObj.getFirstSelectedOption();
		;
		System.out.println(a2.getText());

		List<WebElement> abc = selectObj.getOptions();
		for (int i = 0; i <= abc.size() - 1; i++) {
			WebElement xyz = abc.get(i);
			String x1 = xyz.getText();
			System.out.println(x1);
		}
		Actions actObj = new Actions(driver);
		WebElement a11 = driver.findElement(By.name("Login"));
		//actObj.click(a11).build().perform();

		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].click();", a11);
		actObj.moveToElement(driver.findElement(By.xpath("//a[text()='Marketing']"))).perform();
		//b[contains(text(),'My Recent FAQs')]
		WebElement a112 = driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]"));

		//jsObj.executeScript("arguments[0].value='shchshfvhdv';", a11);
		jsObj.executeScript("arguments[0].scrollIntoView();",a112 );
		jsObj.executeScript("window.scrollBy(1000 , 0);","" );

		
		
		

		//WebElement to = driver.findElement(By.xpath("//tr[@id='headerrow_10']"));
		//WebElement from = driver.findElement(By.xpath("//tr[@id='headerrow_15']"));
		//actObj.contextClick(from).build().perform();
		/*
		 * actObj.dragAndDrop(to, from).build().perform();
		 * actObj.clickAndHold(from).moveToElement(to).release().build().perform();
		 * actObj.doubleClick(from).build().perform(); WebElement marketi232ngObj =
		 * driver.findElement(By.linkText("Marketing"));
		 */
		// actObj.moveToElement(marketingObj,xCord , yCord).build().perform();

	}
}
