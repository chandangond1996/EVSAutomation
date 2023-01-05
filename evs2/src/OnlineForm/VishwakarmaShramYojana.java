package OnlineForm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VishwakarmaShramYojana {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("incognito");
		ChromeDriver driver= new ChromeDriver(op);
		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver.navigate().to("https://diupmsme.upsdc.gov.in/login/Registration_Login");
		
	}

}
