package VtigerFolder;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.aventstack.extentreports.ExtentReports;

import GenericMethodsFolder.GenericMethodsOfClass;

public class ColorVerify {

	public static void main(String[] args) throws IOException {
		GenericMethodsOfClass gnc = new GenericMethodsOfClass();
		ExtentReports ext = gnc.genaretReports("TC002");
		gnc.openBrowser("chrome");
		gnc.navigateUrl("http://localhost:8888");
		gnc.getCssValue("//input[@name='Login']", "xpath", "Login button", "background-color", "#000000");
		gnc.actionSendKeys("user name", "admin").sendKeys(Keys.TAB, "admin", Keys.ENTER).perform();
		ext.flush();
	}

}
