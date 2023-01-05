package OnlineForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScholarShip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
//		op.setExperimentalOption("", new String());
		ChromeDriver driver = new ChromeDriver(op);
		driver.navigate().to("https://scholarship.up.gov.in/");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Student']"))).perform();
		Thread.sleep(2000);
		ac.sendKeys(driver.findElement(By.xpath("//a[text()='Student']//parent::li//a[text()='Registration']")),
				Keys.ENTER).perform();
		driver.findElement(By.xpath(
				"//h3[contains(text(),'OBC ')]//parent::div//following-sibling::div//a[text()='Prematric (Fresh)']"))
				.click();
		String ActualText = driver.findElement(By.xpath("//h1[contains(text(),'Last Date Ended For The Process')]"))
				.getText();
		String ExpectedText = "Last Date Ended For The Process.";
		// System.out.println(ActualText);
		if (ActualText.equalsIgnoreCase(ExpectedText)) {
			System.out.println("9th date expire..");
			driver.findElement(By.xpath("//a[text()='Back to Home Page']")).click();
			ac.moveToElement(driver.findElement(By.xpath("//a[text()='Student']"))).perform();
			Thread.sleep(2000);
			ac.sendKeys(driver.findElement(By.xpath("//a[text()='Student']//parent::li//a[text()='Registration']")),
					Keys.ENTER).perform();
			driver.findElement(By.xpath(
					"//h3[contains(text(),'OBC ')]//parent::div//following-sibling::div//a[text()='Postmatric Intermediate (Fresh)']"))
					.click();
			System.out.println(
					driver.findElement(By.xpath("//span[text()='(हाईस्कूल प्रमाणपत्र के आधार पर-(dd/mm/yyyy))*']"))
							.getText());
		} else {
			System.out.println("=================");
		}
	}
}
