package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeReport {

	public static void main(String[] args) throws InterruptedException, IOException {
//POC profe of concept      // Extensible markup language
		File fileobj = new File("Vtiger.html");
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(fileobj);
		ExtentReports extReport = new ExtentReports();
		extReport.attachReporter(htmlReport);
		ExtentTest extTest = extReport.createTest("TC001");

		extReport.setSystemInfo("OS name", System.getProperty("os.name"));
		extReport.setSystemInfo("User Name", System.getProperty("user.name"));
		extReport.setSystemInfo("Server Name", "QA Server");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		extTest.log(Status.INFO, "Chrome Browser launched Succesfully");
		driver.get("http://localhost:8888");
		extTest.log(Status.INFO, "Url Navigated https://localhost:8888");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		extTest.log(Status.INFO, "Username(admin) is entered successfully in username");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		extTest.log(Status.INFO, "Passoword(admin) is entered successfully in userpassword");

		driver.findElement(By.xpath("//input[@name='Login']")).click();
		extTest.log(Status.INFO, "Clicked Performed Successfully on Login Button");

		boolean checkMarketingButton = driver.findElement(By.linkText("Marketing")).isEnabled();
		if (checkMarketingButton == false) {
			extTest.log(Status.PASS, "Marketing Button visable TC001 is pass");
		} else {
			extTest.log(Status.FAIL, "Marketing Button visable TC001 is fail");
			Date date = new Date();
			long lg = date.getTime();

			TakesScreenshot scShot = (TakesScreenshot) driver;
			File from = scShot.getScreenshotAs(OutputType.FILE);
			File to = new File("takes//" + lg + "screenshot.png");
			Files.copy(from, to);
			extTest.addScreenCaptureFromPath(to.getAbsolutePath());
		}
		driver.findElement(By.linkText("Marketing")).click();
		extTest.log(Status.INFO, "Clicked Performed Successfully on Marketing Button");
		ExtentTest extTest2 = extReport.createTest("TC002");
		boolean checkLeadsButtonClickable = driver.findElement(By.linkText("Leads")).isEnabled();
		if (checkLeadsButtonClickable == true) {
			extTest2.log(Status.PASS, "Leads button is clickable so TC002 is passed");
		} else {
			extTest2.log(Status.FAIL, "Leads button is clickable so TC002 is passed");
		}
		ExtentTest extTest3 = extReport.createTest("TC003");
		boolean checkAccountsButtonClickable = driver.findElement(By.linkText("Accounts")).isEnabled();
		if (checkAccountsButtonClickable == false) {
			extTest3.log(Status.PASS, "Accounts button is clickable so TC003 is passed");
		} else {
			extTest3.log(Status.FAIL, "Accounts button is clickable so TC003 is passed");
			TakesScreenshot scShot = (TakesScreenshot) driver;
			File from = scShot.getScreenshotAs(OutputType.FILE);
			File to = new File("takes//screenshot.png");
			Files.copy(from, to);
			extTest.addScreenCaptureFromPath(to.getAbsolutePath());
		}
		ExtentTest extTest4 = extReport.createTest("TC004");
		boolean checkDocumentsButtonClickable = driver.findElement(By.linkText("Documents")).isEnabled();
		if (checkDocumentsButtonClickable == true) {
			extTest4.log(Status.PASS, "Documents button is clickable so TC003 is passed");
		} else {
			extTest4.log(Status.FAIL, "Documents button is clickable so TC003 is passed");
			TakesScreenshot scShot = (TakesScreenshot) driver;
			File from = scShot.getScreenshotAs(OutputType.FILE);
			File to = new File("takes//screenshot.png");
			Files.copy(from, to);
			extTest.addScreenCaptureFromPath(to.getAbsolutePath());
		}

		extReport.flush();
	}

	public static void getScreenShot() {
		WebDriverWait wait = new WebDriverWait(null, null);
		wait.until(ExpectedConditions.visibilityOf(null));

//		extTest4.log(Status.FAIL, "Documents button is clickable so TC003 is passed");
//		TakesScreenshot scShot = (TakesScreenshot) driver;
//		File from = scShot.getScreenshotAs(OutputType.FILE);
//		File to = new File("takes//screenshot.png");
//		Files.copy(from, to);
//		extTest.addScreenCaptureFzromPath(to.getAbsolutePath());
	}
	// if we want to represent
}
