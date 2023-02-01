package GenericMethodsFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShivGeneric {
	WebDriver driver;
	ExtentTest extTest;

	public WebDriver launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
//			extTest.log(Status.INFO, "chromeDriver Launched SuccessFully");
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
//			extTest.log(Status.INFO, "fireFoxDriver Launched SuccessFully");
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
//			extTest.log(Status.INFO, "edgeDriver Launched SuccessFully");
		} else {
			extTest.log(Status.FAIL, "Something went Wrong Please check Name");
		}
		return driver;

	}

	public void navigateUrl(String url) {
		driver.get(url);
//		extTest.log(Status.INFO, "URL Navigate"+url+"Successfully");
	}

	public WebElement getWebElement(String locatorValue, String locatorType, String elementName) {
		WebElement we = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			we = driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			we = driver.findElement(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("class")) {
			we = driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("id")) {
			we = driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linkText")) {
			we = driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("partial")) {
			we = driver.findElement(By.partialLinkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			we = driver.findElement(By.tagName(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			we = driver.findElement(By.cssSelector(locatorValue));
		}else {
			extTest.log(Status.FAIL,elementName+ "xpath");
		}
		return we;

	}
	public boolean checkElement(String locatorValue,String locatorType,String elementName) {
		boolean status  = false;
		WebElement we=getWebElement(locatorValue, locatorType, elementName);
		if(we.isDisplayed()) {
			extTest.log(Status.PASS,elementName+" isDispalyed");
	if (we.isEnabled()) {
		extTest.log(Status.FAIL, elementName+"Element is enable");
		status=true;
	}else {
		extTest.log(Status.FAIL, elementName+"Element is Disable");
	}
		}else {
			extTest.log(Status.FAIL,elementName+"element is not displayed");
		}
		return status;
	}
	
	
}
