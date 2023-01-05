package SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchBrowserFirfox {

	public static void main(String[] args) throws InterruptedException {
		LounchBrowserFirfox var = new LounchBrowserFirfox();
		var.method2();

	}

	public void method2() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
//		driver.get("http://localhost:8888/");
//		
//		By byname=By.name("user_name");
//		WebElement findElem=driver.findElement(byname);
//		findElem.sendKeys("admin");
//		
//		By bypass=By.name("user_password");
//		WebElement findpass=driver.findElement(bypass);
//		findpass.sendKeys("admin");
//		
//		By byclick=By.xpath("//input[@name='Login']");
//		WebElement findclick=driver.findElement(byclick);
//		findclick.click();
//		
//		driver.manage().window().maximize();
//		//Thread.sleep(5000);
//		//driver.close();
//		
//		WebElement weserchlink=driver.findElement(By.linkText("Marketing"));
//		weserchlink.click();
//		
//		WebElement weserchbox=driver.findElement(By.className("txtBox"));
//		weserchbox.sendKeys("2");
//		
//		WebElement weclick=driver.findElement(By.xpath("//input[@class='crmbutton small create']"));
//		weclick.click();
//		
//		WebElement weWatch=driver.findElement(By.xpath("//img[@alt='Show World Clock...']"));
//		weWatch.click();
//		
//		WebElement weclose=driver.findElement(By.xpath("//img[@src='themes/images/close.gif']"));
//		weclose.click();
//				
//		WebElement weAll=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3AllMenu.gif']"));
//		weAll.click();
//		
//		WebElement weInv=driver.findElement(By.linkText("Invoice"));
//		weInv.click();
//		WebElement plus=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//		plus.click();
//		
//		String text=driver.findElement(By.linkText("Invoice")).getText();
//		
//		if(text.equalsIgnoreCase("Invoice")) {
//			System.out.println("Search Testing is Passed");
//		}else {
//			System.out.println("Search Testing is Failed");
//		}
//		WebElement subjectN=driver.findElement(By.xpath("//input[@name='subject']"));
//		subjectN.sendKeys("Mangesh Don");
//		WebElement custNo=driver.findElement(By.id("customerno"));
//		custNo.sendKeys("C420");
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
//		driver.findElement(By.xpath("//a[text()='Moore Margaret']")).click();
//		driver.findElement(By.linkText("SO_vendtl")).click();
//
//		driver.close();
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.youtube.com/");
		WebElement yout=obj.findElement(By.name("search_query"));
		yout.sendKeys("i love my India");
		
		WebElement clickserch=obj.findElement(By.name("butoon"));
		clickserch.click();
				
		
		
	}

}
