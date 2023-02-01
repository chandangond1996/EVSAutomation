package VtigerFolder;

import java.io.IOException;
import org.openqa.selenium.Keys;
import com.aventstack.extentreports.ExtentReports;

import GenericMethodsFolder.GenericMethodsOfClass;

public class HandleBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		GenericMethodsOfClass gnc = new GenericMethodsOfClass();
		ExtentReports ext = gnc.genaretReports("TC002");
		gnc.openBrowser("chrome");
		gnc.navigateUrl("http://localhost:8888");
		gnc.actionSendKeys("user name", "admin").sendKeys(Keys.TAB, "admin", Keys.ENTER).perform();
		gnc.actionClick("About Us", "innerTest", "about us");
		gnc.actionClick("Feedback", "innerTest", "feedback");
		gnc.switchToWindowByTitle("vtiger CRM 5 - Free, Commercial grade Open Source CRM");
		gnc.getInnerTextMultipleElements("//table[@class='rollOver']//a", "xpath", "text");
		ext.flush();
	}
}
