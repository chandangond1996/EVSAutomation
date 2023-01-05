package SeliniumPractice.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.RandomString;

public class PracticeAutomationByRoshan {
	static WebDriver driver;

	public static void main(String[] args) {

		registeredAccount();
		loginAccountWithInvalidEmail();
		loginAccountWithEmptyEmail();
	}

	public static void registeredAccount() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		RandomString random = new RandomString();
		String randomValue = random.make(9);
		String randomValueGmail = randomValue + "@gmail.com";
		driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys(randomValueGmail);
		driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("Munna@#2412hnh");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String getTextSignOut = driver.findElement(By.xpath("//a[text()='Sign out']")).getText();
		if (getTextSignOut.equalsIgnoreCase("Sign out")) {
			System.out.println("There is User will be registered successfully");
			System.out.println("We are successfully navigatd to the home page");
		}
	}

	public static void loginAccountWithInvalidEmail() {
//		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("incognito");
//		driver=new ChromeDriver(options);
//		driver.get("http://practice.automationtesting.in/");
//		driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chandansts@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Munna@321");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String getMassText = driver
				.findElement(By.xpath("//li[text()=' A user could not be found with this email address.']")).getText();
		String actualMassText = "Error: A user could not be found with this email address.";
		if (getMassText.equalsIgnoreCase(actualMassText)) {
			System.out.println("Testing is Pass because without Invalid Email we not login this page");
			System.out.println("You must enter a valid email address");
		} else {
			System.out.println("Testing is failed....");
		}

	}

	public static void loginAccountWithEmptyEmail() {
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Munna@321");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String getErrorMassText = driver.findElement(By.xpath("//li[text()=' Username is required.']")).getText();
		String actualMassText = "Error: Username is required.";
		if (getErrorMassText.equalsIgnoreCase(actualMassText)) {
			System.out.println("Testing is Pass because we are not login successfully");
			System.out.println("UserName or Email address Box is Empty");
			System.out.println("Please provide valid email address");
		} else {
			System.out.println("your email is right....");
		}

	}
}
