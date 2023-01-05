package SeliniumPractice.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WhatsApp_Send_PDF {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/search?q=whatsapp+web&oq=wh&aqs=chrome.0.69i59j69i57j0i131i433i512j69i59j0i131i433i512j69i60j69i61l2.1221j0j9&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//h3[text()='WhatsApp Web']")).click();
		
	}

}
