package Self;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerByM {

	public static void main(String[] args) throws InterruptedException {
		// each an every object cnverten hash code 
		
		System.out.println("B".compareTo("A"));
		System.out.println("A".hashCode());
		System.out.println("C".hashCode());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		Actions ac = new Actions(driver);
		ac.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).perform();
		List<WebElement> listOfTop = driver.findElements(By.xpath("//div[@class='MatrixLayer ']"));
		for (int i = 0; i < listOfTop.size(); i++) {;
//			WebElement weObj = listOfTop.get(i);
			String strTop = listOfTop.get(i).getText();
			if (strTop.contains("Key Metrics")) {
				Thread.sleep(2000);
				WebElement keyMetrics = driver.findElement(By.xpath("//b[contains(text(),'Key Metrics')]"));
				WebElement noDataFound = driver.findElement(By.xpath("//div[text()='No Data Found']"));
				ac.clickAndHold(keyMetrics).dragAndDrop(keyMetrics, noDataFound).perform();
			} else if (strTop.contains("Tag Cloud")) {
				System.out.println("hello");
			} else if (strTop.contains("Top Potentials")) {
				System.out.println("India");
			}
		}
	}

}
