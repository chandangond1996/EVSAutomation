package SeliniumPractice.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitigerCRM_Project {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean userNameVisible=userName.isEnabled();
		if(userNameVisible==true) {
			System.out.println("UserName Box is Visible..");
		}else {
			System.out.println("UserName Box is not Visible");
		}
		
		boolean userNameDisplay=userName.isDisplayed();
		if(userNameDisplay==true) {
			System.out.println("UserName Box is Displayed.");
		}else {
			System.out.println("UserName Box is not Displayed..");
		}
		
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean userPassowrdVisible=userPassword.isEnabled();
		if(userPassowrdVisible==true) {
			System.out.println("UserPassword Box is Visible..");
		}else {
			System.out.println("UserPassword Box is not Visible");
		}
		
		boolean userPasswordDisplay=userPassword.isDisplayed();
		if(userPasswordDisplay==true) {
			System.out.println("UserPassword Box is Displayed.");
		}else {
			System.out.println("UserPassword Box is not Displayed..");
		}
		
		WebElement colorThemeW=driver.findElement(By.xpath("//select[@name='login_theme']"));
		boolean colorThemeVisible=colorThemeW.isEnabled();
		if(colorThemeVisible==true) {
			System.out.println("ColorTheme is Visible.");
		}else {
			System.out.println("ColorTheme is not Visible");
		}
		boolean colorThemeDisplay=colorThemeW.isDisplayed();
		if(colorThemeDisplay==true) {
			System.out.println("ColorTheme is Displayed..");
		}else {
			System.out.println("ColorTheme is not Displayed");
		}
		
		//login_language
		WebElement languageW=driver.findElement(By.xpath("//select[@name='login_language']"));
		boolean languageVisible=languageW.isEnabled();
		if(languageVisible==true) {
			System.out.println("Language is Visible.");
		}else {
			System.out.println("Language is not Visible");
		}
		boolean languageDisplay=languageW.isDisplayed();
		if(languageDisplay==true) {
			System.out.println("Language is Displayed..");
		}else {
			System.out.println("Language is not Displayed");
		}
		
		WebElement loginButtonW=driver.findElement(By.xpath("//input[@name='Login']"));
		boolean loginButtonVisible=loginButtonW.isEnabled();
		if(loginButtonVisible==true) {
			System.out.println("LoginButton is Visible..");
		}else {
			System.out.println("Login Button is not Visible");
		}
		boolean loginButtonDisplay=loginButtonW.isDisplayed();
		if(loginButtonDisplay==true) {
			System.out.println("Login Button is Displayed");
		}else {
			System.out.println("Login Button is not Displayed");
		}
		WebElement userNameBox=driver.findElement(By.xpath("//input[@name='user_name']"));
		userNameBox.sendKeys("admin");
		String enterValueUserBox=userNameBox.getAttribute("value");
		if(enterValueUserBox.equalsIgnoreCase("admin")) {
			System.out.println("User is enter Value in userBox successfully");
		}else {
			System.out.println("User is not enter Value in userBox ");
		}
		WebElement userPasswordBox= driver.findElement(By.xpath("//input[@name='user_password']"));
		userPasswordBox.sendKeys("admin");
		String enterValueUserPasswordBox=userPasswordBox.getAttribute("value");
		if(enterValueUserPasswordBox.equalsIgnoreCase("admin")) {
			System.out.println("User is enter Passowrd in Password Box successfully");
		}else {
			System.out.println("User is not enter Passowrd in Password Box successfully ");
		}
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		String getTextOfTitle=driver.getTitle();
//		System.out.println(getTextOfTitle);
		if(getTextOfTitle.contains("My Home Page")) {
			System.out.println("Home page should be appeared");
		}else {
			System.out.println("Home page should not be appeared");
		}
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("adm");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admn");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		String getTextErrorActual=driver.findElement(By.xpath("//font[contains(text(),'You must specify a valid username and password')]")).getText();
		String getTextErrorExcepted="You must specify a valid username and password.";
		if(getTextErrorActual.equalsIgnoreCase(getTextErrorExcepted)) {
			System.out.println("On Login Page User Should be get Error Massage");
		}else {
			System.out.println("On Login Page User Should not be get Error Massage");
		}
		
	}

}
