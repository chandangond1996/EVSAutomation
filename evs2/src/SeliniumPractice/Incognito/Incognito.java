package SeliniumPractice.Incognito;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.navigate().to("https://www.google.com/");
		
	}

}
