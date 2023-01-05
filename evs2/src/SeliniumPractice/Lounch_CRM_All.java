package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Service.State;

public class Lounch_CRM_All {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		WebElement pass = driver.findElement(By.name("user_password"));
		pass.sendKeys("admin");

		Select SelObj = new Select(driver.findElement(By.name("login_theme")));
		SelObj.selectByIndex(2);

		SelObj.getFirstSelectedOption();

		Select SelectObj = new Select(driver.findElement(By.name("login_language")));
		SelectObj.selectByIndex(0);

		Select slt=new Select(pass);
		
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		// driver.manage().window().maximize();
		WebElement CampaigName = driver.findElement(By.name("campaignname"));
		CampaigName.sendKeys("Rakesh");
		WebElement TargetAyduebce = driver.findElement(By.id("targetaudience"));
		TargetAyduebce.sendKeys("250");
		WebElement Sponsor = driver.findElement(By.id("sponsor"));
		Sponsor.sendKeys("Ramkumar");
		WebElement NumSent = driver.findElement(By.id("numsent"));
		NumSent.sendKeys("50");
		WebElement TargetSize = driver.findElement(By.id("targetsize"));
		TargetSize.sendKeys("4");
		WebElement Cost = driver.findElement(By.id("budgetcost"));
		Cost.clear();
		Cost.sendKeys("500");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Clock.gif']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='themes/images/close.gif']")).click();
		Thread.sleep(5000);
		String getTextValue = driver.findElement(By.className("moduleName")).getText();
		String mar = "Marketing > Campaigns";
		if (getTextValue.equalsIgnoreCase(mar)) {
			System.out.println("Marketing Testing is Passed");
		} else {
			System.out.println("Marketing Testing is Failed");
		}

		String getText = driver.findElement(By.xpath("//input[@class='crmbutton small edit']")).getAttribute("type");
		String Actual = "button";
		if (getText.equalsIgnoreCase(Actual)) {
			System.out.println("Edit Testing is Passed");
		} else {
			System.out.println("Edit Testing is Failed");
		}

		String getValueActual = driver.findElement(By.name("Duplicate")).getAttribute("value");
		String Expected = "Duplicate";
		if (getValueActual.equalsIgnoreCase(Expected) == true) {
			System.out.println("Duplicate Testing is Passed");
		} else {
			System.out.println("Duplicate Testing is Failed");
		}

		boolean EnabledActual = driver.findElement(By.xpath("//a[text()='Sign Out']")).isEnabled();
		boolean EnabledExpected = true;
		if (EnabledActual == EnabledExpected) {
			System.out.println("Sign out Bootun is Passed Becouse her Enabled");
		} else {
			System.out.println("Sign Out Bootun is Failed Becouse her Disabled");
		}

		boolean searchActual = driver.findElement(By.xpath("//img[@src='themes/images/btnL3Search-Faded.gif']"))
				.isEnabled();
		boolean searchExpected = true;
		if (searchActual == searchExpected) {
			System.out.println("Search Bootun Testing is Passed becouse Enabled");
		} else {
			System.out.println("Search Bootun Testing is Failed Becouse Disabled");
		}

// Check Box's Selected or unSelected
		System.out.println();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sales")).click();
		boolean CheckCheckBoxUnSelected = driver.findElement(By.xpath("//input[@name='selectall']")).isSelected();
		System.out.println(CheckCheckBoxUnSelected);
		if (CheckCheckBoxUnSelected == false) {
			System.out.println("CheckBox Testing is Passed. here UnSelected");
		} else {
			System.out.println("CheckBox Testing is Failed. here Selected");
		}
		System.out.println("Jay Hind - Jay Bharat");
//Check Box's Selected or unSelected
//		driver.findElement(By.name("selectall")).click();
		driver.findElement(By.xpath("//input[@name='selectall']")).click();
		boolean CheckcheckBoxSelected = driver.findElement(By.xpath("//input[@name='selectall']")).isSelected();
		System.out.println(CheckcheckBoxSelected);
		if (CheckcheckBoxSelected == true) {
			System.out.println("CheckBox Testing is Passed. Selected");
		} else {
			System.out.println("CheckBox Testing is Failed. unSelected");
		}
// Check Box's Selected or unSelected
		System.out.println();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		// driver.findElement(By.name("salutationtype")).click();
		WebElement Name = driver.findElement(By.name("firstname"));
		Name.sendKeys("Shivam");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("jaiswal");
		WebElement companyName = driver.findElement(By.name("company"));
		companyName.sendKeys("T C S");
		WebElement titleName = driver.findElement(By.id("designation"));
		titleName.sendKeys("Expert View");
		WebElement mobileNo = driver.findElement(By.id("mobile"));
		mobileNo.sendKeys("9935tamam032");
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("shivam72@gmail.com");
		WebElement AddreshName = driver.findElement(By.name("lane"));
		AddreshName.sendKeys("Mondh Bazar Mondh Bhadohi");
		WebElement PinCode = driver.findElement(By.id("code"));
		PinCode.sendKeys("221406");
		WebElement CountryName = driver.findElement(By.id("country"));
		CountryName.sendKeys("India");
		WebElement StateName = driver.findElement(By.id("state"));
		StateName.sendKeys("Utter Pradesh");
		WebElement CityName = driver.findElement(By.id("city"));
		CityName.sendKeys("Bhadohi");
		WebElement Description = driver.findElement(By.name("description"));
		Description.sendKeys("Hello How are you - what are you doing......");
		Thread.sleep(10000);

		driver.findElement(By.name("button")).click();
		driver.findElement(By.name("Edit")).click();
		WebElement Website = driver.findElement(By.name("website"));
		Website.sendKeys("http//:www.apnatimeayega.in.com/");
		WebElement DescriptionEdit = driver.findElement(By.name("description"));
		DescriptionEdit.sendKeys("When will I get job... when will I drink bear with friends");
		driver.findElement(By.name("button")).click();
		Thread.sleep(5000);

		String ActualText = driver.findElement(By.xpath("//td[text()='Lead Information']")).getText();
		String ExpectedText = "Lead Information";
		if (ActualText.equalsIgnoreCase(ExpectedText)) {
			System.out.println("Lead Information Testing is Passed");
		} else {
			System.out.println("Lead Information Testing is Failed");
		}
		boolean ActualEnabled = driver.findElement(By.xpath("//img[@src='themes/images/btnL3Search-Faded.gif']"))
				.isEnabled();
		boolean ExpectedEnabled = true;
		if (ActualEnabled == ExpectedEnabled) {
			System.out.println("Search Button Testing is Passed becouse Enabled");
		} else {
			System.out.println("Search Button Testing is Failed becouse Desabled");
		}

		Dimension getButtonSize = driver.findElement(By.name("Duplicate")).getSize();
		int Height = getButtonSize.getHeight();
		int Width = getButtonSize.getWidth();
		System.out.println(Height + "," + Width);

		Dimension getVImgSize = driver.findElement(By.xpath("//img[@src='themes/softed/images/vtiger-crm.gif']"))
				.getSize();
		int HeightI = getVImgSize.getHeight();
		int WidthI = getVImgSize.getWidth();
		System.out.println(HeightI + "," + WidthI);

		boolean ActualcheckDisplay = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Clock.gif']"))
				.isDisplayed();
		if (ActualcheckDisplay == true) {
			System.out.println("Clock Testing is Passed. Display");
		} else {
			System.out.println("Clock Testing is Failed. UnDisplay");
		}

		Point ActualLocation = driver.findElement(By.name("mapbutton")).getLocation();
		int getHeight = ActualLocation.getX();
		int getWidth = ActualLocation.getY();
		System.out.println("LocationOfButton" + "=" + getHeight + "," + getWidth);

		Point getActualLocation = driver.findElement(By.xpath("//img[@src='themes/softed/images/settingsBox.png']"))
				.getLocation();
		int getX = getActualLocation.getX();
		int getY = getActualLocation.getY();
		System.out.println("settingBoxLocation" + "= " + getX + "," + getY);

		Select selobj = new Select(driver.findElement(By.id("qccombo")));
		selobj.selectByIndex(5);
		Thread.sleep(4000);
		WebElement weobj = driver.findElement(By.id("qccombo"));
		Select objSelect = new Select(weobj);
		objSelect.selectByValue("Calendar");
		Thread.sleep(4000);
		objSelect.selectByVisibleText("New Event");

		WebElement allWeb = driver.findElement(By.xpath("//select[@class='small']"));
		Select objS = new Select(allWeb);
		WebElement objWeb = objS.getFirstSelectedOption();
		String textValue = objWeb.getText();
		System.out.println(textValue);

		Select objSelectText = new Select(driver.findElement(By.id("qccombo")));
		String webOBJ = objSelectText.getFirstSelectedOption().getText();
		if (webOBJ.equals("New Event")) {
			System.out.println("New Event Testing is Passed");
		} else {
			System.out.println("New Event Testing is Failed");
		}

	}

	// This is Method of WebElement = sendkey, click, clear, getText,
	// getAttribute, isEnable, isSelected, getSize, getLocation,
	// This is Class =ChromeDriver, WebElement, Dimension, Point, Select

}
