package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStudentForm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/student-registration-form.html?m=1");
		driver.findElement(By.xpath("//input[@name='First_Name']")).sendKeys("Pradeep");
		driver.findElement(By.xpath("//input[@name='Last_Name']")).sendKeys("Pal");
		driver.findElement(By.xpath("//select[@id='Birthday_Day']")).sendKeys("15");
		driver.findElement(By.xpath("//select[@id='Birthday_Month']")).sendKeys("july");
		driver.findElement(By.xpath("//select[@id='Birthday_Year']")).sendKeys("1995");
		driver.findElement(By.xpath("//input[@name='Email_Id']")).sendKeys("pradeepkumar420@gmail.com");
		driver.findElement(By.xpath("//input[@name='Mobile_Number']")).sendKeys("83745923458");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//textarea[@name='Address']")).sendKeys("Purani Bazar mondh");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Bhadohi");
		driver.findElement(By.xpath("//input[@name='Pin_Code']")).sendKeys("221406");
		driver.findElement(By.xpath("//input[@name='State']")).sendKeys("U.P.");
		String actualText=driver.findElement(By.xpath("//input[@name='Country']")).getAttribute("value");
		if(actualText.equalsIgnoreCase("India")) {
			System.out.println("Testing is passed becouse here get India");
		}else {
			System.out.println("Testing is Failed becouse here not get Text india");
		}
		driver.findElement(By.xpath("//input[@value='Drawing']")).click();
		driver.findElement(By.xpath("//input[@name='ClassX_Board']")).sendKeys("UP Board");
		driver.findElement(By.xpath("//input[@name='ClassX_Percentage']")).sendKeys("70%");
		driver.findElement(By.xpath("//input[@name='ClassX_YrOfPassing']")).sendKeys("2018");
		driver.findElement(By.xpath("//input[@name='BCA']")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		//driver.close();
	}

}
