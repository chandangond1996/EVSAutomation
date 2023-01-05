package SeliniumPractice;

//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Satyam_Sir {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("http:/localhost:8888");
		driver2.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("admin");
		driver2.findElement(By.name("user_password")).sendKeys("admin");
		driver2.findElement(By.name("Login")).click();
		List<WebElement> getList = driver2
				.findElements(By.xpath("//div[@class='MatrixLayer ']//td[@class='homePageMatrixHdr']//b"));
		for (int i = 0; i < getList.size(); i++) {
			WebElement getValue = getList.get(i);
			i = i + 1;
			String hamarsirjee = getValue.getText();
			System.out.println(i + " " + hamarsirjee);
			i = i - 1;
		}
// No Data Found      // No Data Found	        	// No Data Found
		Thread.sleep(2000);
		List<WebElement> noDataFound = driver2.findElements(By.xpath("//div[text()='No Data Found']"));
		System.out.println(noDataFound.size());
		for (int i = 0; i < noDataFound.size(); i++) {
			Thread.sleep(1000);
			WebElement getNoData = noDataFound.get(i);
			String getTextofData = getNoData.getText();
			System.out.println(getTextofData);
		}

		Thread.sleep(2000);
		driver2.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Marketing']//parent::td//img")).click();
		driver2.findElement(By.xpath("//div[@id='Marketing_sub']//tr//td//a[text()='Leads']")).click();
		System.out.println("Hello");
// All Last Name Print     // All Last Name Print    // All Last Name Print		
		Thread.sleep(2000);
		List<WebElement> getLastN = driver2.findElements(By.xpath(
				"//a[text()='Last Name']//parent::td//parent::tr//parent::tbody//tr//span[@vtfieldname='lastname']//parent::td//a[@title='Leads']"));
		for (int i = 0; i < getLastN.size(); i++) {
			WebElement getLstNameNo = getLastN.get(i);
			i = i + 1;
			System.out.println(i + " " + getLstNameNo.getText());
			i = i - 1;
		}
// Alpha  A to Z :-		
		List<WebElement> AlphaAtoZ = driver2.findElements(By.xpath("//td[@class='searchAlph']"));
		for (int i = 0; i < AlphaAtoZ.size(); i++) {
			WebElement getAlphaNo = AlphaAtoZ.get(i);
			String getAlphaText = getAlphaNo.getText();
			getAlphaNo.click();
			System.out.print(getAlphaText);
			System.out.println();
			Thread.sleep(2000);
			List<WebElement> getNoOfButton = driver2.findElements(By.xpath("//input[@type='checkbox']"));
			int getTextNoF = getNoOfButton.size();
			if (getTextNoF == 1) {
				System.out.println("No Lead Found !");
			} else {
				int no = getTextNoF - 1;
				System.out.println("Showing Records" + " " + no);
			}
		}

//		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.navigate().to("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
//		driver.findElement(By.xpath("Login")).click();
	}
}
// get is wait the load the page
// but navigate is not wait the load page