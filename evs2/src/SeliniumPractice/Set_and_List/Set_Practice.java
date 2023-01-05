package SeliniumPractice.Set_and_List;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Set_Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();
		List<WebElement> getList = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
		Set<String> setTree = new TreeSet<>();
		String getText = null;
		for (int i = 0; i < getList.size(); i++) {
			getList = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
			WebElement objW = getList.get(i);
			getText = objW.getText();
			System.out.println(getText);
			setTree.add(objW.getText());
		}
		System.out.println("====");
		for (String string : setTree) {
			
			System.out.println(string);

			if (getText.contains(string)) {
				System.out.println("Testing is passed..");
			} else {
				System.out.println(getText);
				System.out.println("Testing is failed");
			}

		}

	}
}