package SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartTesting {
//	static int x;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("connect the net...brother");
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> getTab = driver.findElements(By.xpath("//div[@class='eFQ30H']//a"));
		for (int i = 0; i < getTab.size(); i++) {
			getTab = driver.findElements(By.xpath("//div[@class='eFQ30H']//a"));
			WebElement getinnerTex = getTab.get(i);
			String getTextName = getinnerTex.getText();
			System.out.println(getTextName);
			getinnerTex.click();
			Thread.sleep(2000);
			if (getTextName.equalsIgnoreCase("Fashion") == false
					&& (getTextName.equalsIgnoreCase("Electronics") == false
							&& (getTextName.contentEquals("Home") == false
									&& (getTextName.contentEquals("Beauty, Toys & More") == false)))) {
				driver.navigate().back();
				Thread.sleep(10000);
			} else {
				System.out.println("------------------");
			}
		}

		driver.findElement(By.xpath("//div//input[@title='Search for products, brands and more']"))
				.sendKeys("lenovo Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> getRateList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> getNameList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		for (int i = 0; i < getNameList.size(); i++) {
			WebElement getLaptopName = getNameList.get(i);
			System.out.println("Laptop Name :- " + getLaptopName.getText());
			WebElement priceRate = getRateList.get(i);
			System.out.println("Laptop Price :- " + priceRate.getText());
		}

		driver.get("https://www.croma.com/");
	}
}
