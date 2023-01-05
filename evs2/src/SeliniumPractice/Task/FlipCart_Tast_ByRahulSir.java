package SeliniumPractice.Task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart_Tast_ByRahulSir {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"))
				.sendKeys("sumsunge mobile", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		List<WebElement> getPriceValue = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//		Thread.sleep(3000);
		String getPriceValueMob = "";
		Set<String> getPriceValueSet = new TreeSet<String>();
		for (int i = 0; i < getPriceValue.size(); i++) {
			getPriceValue = driver.findElements(By.xpath("//div[@class='_30jeq3_1_WHN1']"));
			WebElement objWe = getPriceValue.get(i);
			getPriceValueMob = objWe.getText();
			System.out.println( getPriceValueMob );

			getPriceValueSet.add(getPriceValueMob);
		}
		System.out.println();
		Thread.sleep(500);

		for (String price : getPriceValueSet) {
			System.out.println(price);
		}

	}

}
