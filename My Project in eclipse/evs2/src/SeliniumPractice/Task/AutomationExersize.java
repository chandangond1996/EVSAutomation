package SeliniumPractice.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationExersize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		String getActualTextOfLogin = driver.findElement(By.xpath("//a[@href=\"/login\"]")).getText();
		if (getActualTextOfLogin.contains("Login")) {
			System.out.println("Home page is Appiared Successfully..");
		} else {
			System.out.println("Failed becouse home page not appeared..");
		}
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		String getActualTextOfSignupButton = driver.findElement(By.xpath("//div[@class='signup-form']//h2")).getText();
		String ExpectedTextOfSignupButton = "New User Signup!";
		if (getActualTextOfSignupButton.equalsIgnoreCase(ExpectedTextOfSignupButton)) {
			System.out.println("Testing is Passed becouse here show New_User_Signup ");
		} else {
			System.out.println("Testing is Failed becouse here Not New_User_Signup ");
		}
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("1111111e@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("8423602082");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		Thread.sleep(2000);
		String getTextActualInformation = driver
				.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
		if (getTextActualInformation.contains("incorrect")) {
			System.out.println("Don't Enter without create Account. ");
			System.out.println(":- first of all go singUp and create Account");
		} else {
			System.out.println("My Account Create Alrady");
//		}String getActualTextLogged2 = driver.findElement(By.xpath("//li//a[contains(text(),' Logged in as ')]"))
//					.getText();
//			String ExpectedTextLogged2 = "Logged chandan";
//		if (getActualTextLogged2.contains(ExpectedTextLogged2)) {
//				System.out.println("Testing is Passed becouse her show Logged in as Raju");
//			} else {
//				System.out.println("Testing is Failed becouse put wrong user_name & Password");
//			
		}
		driver.findElement(By.name("name")).sendKeys("shiva ");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("s111111111@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		String getActualTex = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText();
		String ExpectedText = "Enter Account Information";
		if (getActualTex.equalsIgnoreCase(ExpectedText)) {
			System.out.println("Verify that 'Enter Account Information' is visible Successfully");
		}
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("8423602082");
		WebElement selectDaysObj = driver.findElement(By.xpath("//select[@id='days']"));
		Select selObj = new Select(selectDaysObj);
		selObj.selectByValue("15");
		WebElement selectMonthObj = driver.findElement(By.xpath("//select[@id='months']"));
		Select selObj2 = new Select(selectMonthObj);
		selObj2.selectByVisibleText("April");
		Select selObj3 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		selObj3.selectByValue("1996");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("ji");
		driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("TCS Lmt. Pvt.");
		driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("Mond");
		driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("Bhadohi");
		Select selectContryOBj = new Select(driver.findElement(By.xpath("//select[@id=\"country\"]")));
		selectContryOBj.selectByIndex(2);
		selectContryOBj.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("U.P");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bhadohi");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("221406");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		String getActualTextAfterCreatedA_C = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
		String ExpectedTextAfterCreated = "ACCOUNT CREATED!";
		System.out.println(getActualTextAfterCreatedA_C);
		if (getActualTextAfterCreatedA_C.contains(ExpectedTextAfterCreated)) {
			System.out.println("Testing is passed becouse Account Created Successfully  ");
		} else {
			System.out.println("Testing is Failed becouse Not Account Created Successfully  ");
		}
		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		String getActualTextLogged = driver.findElement(By.xpath("//li//a[contains(text(),' Logged in as ')]"))
				.getText();
		String ExpectedTextLogged = "Logged";
		if (getActualTextLogged.contains(ExpectedTextLogged)) {
			System.out.println("Testing is Passed becouse her show Logged in as Raju");
		} else {
			System.out.println("Testing is Failed becouse put wrong user_name & Password");
		}
//		} 
//			System.out.println("Login Successfully ..");

	}

}
