package Self;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class ScreenShot {
	static int from;

	public static void main(String[] args) throws IOException, InterruptedException {
		methd();
		ExtentSparkReporter esr = new ExtentSparkReporter("Vtiger.html");
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(esr);
		ExtentTest exText = ext.createTest("TC001");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		exText.log(Status.INFO, "browser lounch successfull..");
		driver.get("http://localhost:8888");
		exText.log(Status.INFO, "Navigate URL successfull..");
		Actions ac = new Actions(driver);
		exText.log(Status.INFO, "Create Actions class of object...");
		ac.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();
		exText.log(Status.INFO, "Enter successfull Credentional...");
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		String expectedText = "admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if (getTitle.equalsIgnoreCase(expectedText)) {
			exText.log(Status.PASS, "Home page appeared successfull...");
		} else {
			exText.log(Status.FAIL, "TC001 fail because Home page not appeared...");
			TakesScreenshot tk = (TakesScreenshot) driver;
			File from = tk.getScreenshotAs(OutputType.FILE);
			File to = new File("takes//screenshot2.png");
			Files.copy(from, to);
			exText.addScreenCaptureFromPath(to.getAbsolutePath());
		}
		ext.flush();
	}

	public static void methd() {
		System.out.println(from);
	}
}
