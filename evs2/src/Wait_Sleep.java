import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Sleep {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		Thread.sleep(100);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ZERO);
//		driver.manage().timeouts().getImplicitWaitTimeout().ofSeconds(10);
		
		WebDriverWait explicitly=new WebDriverWait(driver, Duration.ofSeconds(60));
		explicitly.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.name("user_name"))));
	}

}
