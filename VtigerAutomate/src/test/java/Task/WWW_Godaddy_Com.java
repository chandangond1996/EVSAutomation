package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWW_Godaddy_Com {
	static WebDriver driver;

	public static void main(String[] args) {
//		maximizeAndCloseBrowserWindow();
//		printTitleAndUrlOfPage();
//		printTitleAndUrlOfPage();
//		validatePageTitleAndUrlAndSource();
//		clickOnFirstMenuLink();
//		allMenuLinksOfGodaddy();
		validateDomainIsAvailableOrNot();
	}

	public static void openURL() {
		driver = new ChromeDriver();
		driver.get("https://www.godaddy.com");

	}

	public static void maximizeAndCloseBrowserWindow() {
		openURL();
		driver.manage().window().maximize();
		driver.close();
	}

	public static void printTitleAndUrlOfPage() {
		openURL();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

	public static void validatePageTitleAndUrlAndSource() {
		openURL();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("TestCase is pass TC003 VailidateTitle");
		} else {
			System.out.println("TestCase is not pass TC003 VailidateTitle");
		}

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.godaddy.com/en-in";
		if (expectedURL.equalsIgnoreCase(actualURL)) {
			System.out.println("TestCase is pass TC003 VailidateURL");
		} else {
			System.out.println("TestCase is failed TC003 VailidateURL");
		}
		String getPageSource = driver.getPageSource();
		System.out.println(actualTitle);
		if (getPageSource.contains(actualURL)) {
			System.out.println("TestCase is pass because : page tile is present in page source..");
		} else {
			System.out.println("TestCase is failed because : page tile is not present in page source..");
		}
	}

	public static void clickOnFirstMenuLink() { // TC001
		openURL();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Domains')]")).click();
		driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
		String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("TC001, TestCase is pass match the title of page with our expected title");
		} else {
			System.out.println("TestCase is failed not match the title of page with our expected title");
		}
	}

	public static void allMenuLinksOfGodaddy() { // TC002
		openURL();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Domains')]")).click();
		driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
		String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("TC002, TestCase is pass match the title of page with our expected title");
		} else {
			System.out.println("TestCase is failed not match the title of page with our expected title");
		}
		driver.findElement(By.xpath("//span[text()='India']//parent::a")).click();
	}

	public static void validateDomainIsAvailableOrNot() {
		openURL();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Domains')]")).click();
		driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
		String actualTitle = driver.getTitle();
		System.out.println("Test Case " + actualTitle);
		String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case is pass because matched actual and expected title");
		} else {
			System.out.println("Test Case is failed because not matched actual and expected title");
		}
		boolean serchBoxP = driver.findElement(By.xpath("//input[@name='searchText']")).isDisplayed();
		if (serchBoxP == true) {
			System.out.println("TestCase is pass because searchBox is present in on page");
		} else {
			System.out.println("TestCase is failed because searchBox is not present in on page");
		}
		boolean serchBoxE = driver.findElement(By.xpath("//input[@name='searchText']")).isEnabled();
		if (serchBoxE == true) {
			System.out.println("TestCase is pass because searchBox is Enableed in on page");
		} else {
			System.out.println("TestCase is failed because searchBox is not Enabled in on page");
		}
		boolean searchButtonD = driver.findElement(By.xpath("//button[@aria-label='Buy It']")).isDisplayed();
		if (searchButtonD == true) {
			System.out.println("TestCase is pass because SearchButton is Enabled");
		} else {
			System.out.println("TestCase is failed because SearchButton is not Enabled");
		}
		driver.findElement(By.xpath("//input[@name='searchText']")).sendKeys("mydomain");
		driver.findElement(By.xpath("//button[@aria-label='Buy It']")).click();
	}

}
