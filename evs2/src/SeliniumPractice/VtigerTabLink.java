package SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerTabLink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		List<WebElement> subTab = driver.findElements(By.xpath("//td[contains(@class,'Selected')]//a"));
		for (int i = 0; i < subTab.size(); i++) {
			subTab = driver.findElements(By.xpath("//td[contains(@class,'Selected')]//a"));
			WebElement tabLink = subTab.get(i);
			String tabLinkText = tabLink.getText();
			System.out.println(i + 1 + "======" + tabLinkText);
			tabLink.click();
			Thread.sleep(2000);
			List<WebElement> inSubTab = driver.findElements(By.xpath("//table[@class='level2Bg']//tr//a"));
			for (int j = 0; j < inSubTab.size(); j++) {
				inSubTab = driver.findElements(By.xpath("//table[@class='level2Bg']//tr//td//a"));
				WebElement subTabLink = inSubTab.get(j);
				String subTabLinkText = subTabLink.getText();
				System.out.println(j + 1 + ":=" + subTabLinkText);
				subTabLink.click();
				String expectedSettingSubModual = tabLinkText + subTabLinkText;
				Thread.sleep(2000);

				if (subTabLinkText.equalsIgnoreCase("Webmail") == false
						&& subTabLinkText.equalsIgnoreCase("Module Manager") == false) {
					String expectedText = tabLinkText + " > " + subTabLinkText;
					String actualText = driver.findElement(By.xpath("//td[@class='moduleName']")).getText();

					if (actualText.equalsIgnoreCase(expectedText))
						System.out.println("-----Passed. Where actual-" + actualText + " && expected-" + expectedText);

				} else {
					if (subTabLinkText.equalsIgnoreCase("Module Manager")) {
						String actualSettingSubModual = driver.findElement(By.xpath("//td[@class='heading2']//b"))
								.getText();
						System.out.println("-----Passed. Where actual :-" + actualSettingSubModual + "expected :-"
								+ expectedSettingSubModual);
					} else {
						System.out.println("Failed. Where actual-" + " && expected- is mismatched");
					}
					System.out.println("---------- Thank you ------------");
				}
			}
		}
	}
}
