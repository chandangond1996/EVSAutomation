package SeliniumPractice.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Upload_Document {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
//		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		//op.addArguments("headless");
		//op.setHeadless(true);
		
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		System.out.println("India");
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//td[@class='level2UnSelTab']//a[text()='Documents']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
		driver.findElement(By.xpath("//input[@name='notes_title']")).sendKeys("UploadD");
		
		Select sl= new Select(driver.findElement(By.xpath("//select[@name='filelocationtype']")));
		sl.selectByIndex(0);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Registration Form.pdf");
		driver.findElement(By.xpath("//td[@class='dvtCellLabel']//parent::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr//input[@value='  Save  ']")).click();
		
	}
}
