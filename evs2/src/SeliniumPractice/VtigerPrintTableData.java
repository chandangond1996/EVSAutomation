package SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerPrintTableData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//table[@class=\"level2Bg\"]//a[text()='Leads']")).click();
//		String getTextTopCampangsHeding = driver.findElement(By.xpath("//td[@class='lvtCol']//parent::tr")).getText();
//		System.out.println(getTextTopCampangsHeding + "----");
//		
//		driver.findElement(By.id("348")).click();
//		driver.findElement(By.xpath("//input[@value='Mass Edit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='firstname_mass_edit_check']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("mobile")).sendKeys("9598935534");
//		driver.findElement(By.name("firstname")).sendKeys("Sunil");
//		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
//		String getTextAllData = driver.findElement(By.xpath("//table[@class='lvt small']")).getText();
//		System.out.println(getTextAllData + "................hii");

		String getTextTopCampangsHeding2 = driver.findElement(By.xpath("//td[@class='lvtCol']//parent::tr")).getText();
		System.out.println(getTextTopCampangsHeding2);
		Thread.sleep(2000);

		List<WebElement> listOfTableCampaingsName = driver
				.findElements(By.xpath("//tr[contains(@onmouseover,'lvtColData')]"));
		for (int i = 0; i < listOfTableCampaingsName.size(); i++) {
			listOfTableCampaingsName = driver.findElements(By.xpath("//tr[contains(@onmouseover,'lvtColData')]"));
			Thread.sleep(2000);
			String getTextOftable = listOfTableCampaingsName.get(i).getText();
			System.out.println(i + 1 + "=" + getTextOftable);
			if (getTextOftable.contains("LEA1")) {
				driver.findElement(By.xpath("//input[@id='32']")).click();
				driver.findElement(By.xpath("//input[@value='Delete']")).click();
				driver.switchTo().alert().dismiss();
				System.out.println("Lead No. (LEA1) Cancel Successfully.....");
			} else {
				System.out.println("Not Deleted this Lead");
				System.out.println(":-:-:-:-:-:-:-:-:-:");
			}
		}


	}

}
