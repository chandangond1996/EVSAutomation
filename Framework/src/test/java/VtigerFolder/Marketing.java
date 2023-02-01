package VtigerFolder;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.aventstack.extentreports.ExtentReports;

import GenericMethodsFolder.GenericMethodsOfClass;

public class Marketing {
	/*
	 * we create main method
	 */
	public static void main(String[] args) throws IOException {
		A_Z();
//		leads();

	}

	public static void A_Z() throws IOException {
		GenericMethodsOfClass gnc = new GenericMethodsOfClass();
		ExtentReports ext = gnc.genaretReports("TC002");
		gnc.openBrowser("chrome");
		gnc.navigateUrl("http://localhost:8888");
		gnc.actionSendKeys("user name", "admin").sendKeys(Keys.TAB, "admin", Keys.ENTER).perform();
		gnc.click("//a[text()='Marketing']", "xpath", "Marketing");
		gnc.clickMultipleElements("//td[@class='searchAlph']", "xpath", "A-Z");
		ext.flush();
	}

	public static void leads() throws IOException {
		GenericMethodsOfClass gnm = new GenericMethodsOfClass();
		ExtentReports ext = gnm.genaretReports("TC001");
		gnm.openBrowser("chrome");
		gnm.navigateUrl("http://localhost:8888");
		gnm.inputTextValue("admin", "//input[@name='user_name']", "xpath", "user name");
		gnm.inputTextValue("admin", "//input[@name='user_password']", "xpath", "user  password");
		gnm.click("//input[@name='Login']", "xpath", "Login ");
		gnm.click("//a[text()='Marketing']", "xpath", "Marketing");
		gnm.click("//a[text()='Leads']", "xpath", "Leads");
		ext.flush();
	}

}
