package SeliniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowserChrome {
 static ChromeDriver driver; 
	public static void main(String[] args) throws InterruptedException {
//         System.out.println(driver);
//		Selinium a=new Selinium();
//		System.out.println(a);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Myfilechandan\\evs2\\driver\\chromedriver.exe");
         driver=new ChromeDriver();  //driver=null;
		   System.out.println(driver);
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		By username=By.name("user_name");
		WebElement webobj=driver.findElement(username);
		webobj.sendKeys("admin");
	
		By byobj=By.name("user_password");
		WebElement Webobj= driver.findElement(byobj);
		Webobj.sendKeys("admin");
		
		driver.manage().window().maximize();
		By c=By.name("Login");
		WebElement clobj= driver.findElement(c);
		clobj.click();
		
		By clen=By.name("query_string");
		WebElement objclender=driver.findElement(clen);
		objclender.sendKeys("I Love My India");
		Thread.sleep(5000);
	    driver.close();
		
	    ChromeDriver driver1=new ChromeDriver();
	    driver1.get("http:/localhost:8888/");
	    
	    By upobj=By.name("user_name");
	    WebElement fobj=driver1.findElement(upobj);
	    fobj.sendKeys("admim");
	    
	    By byobj2=By.name("user_password");
	    WebElement uPass=driver1.findElement(byobj2);
	    uPass.sendKeys("shivam");
	    
	    By log=By.name("Login");
	    WebElement logfind=driver1.findElement(log);
	    logfind.click();
	    
	    Thread.sleep(5000);
	    driver1.close();
	    
	    ChromeDriver objch=new ChromeDriver();
	    objch.get("https://www.youtube.com/");
	    objch.manage().window().maximize();
	    By youobj=By.name("search_query");
	     WebElement youfind=objch.findElement(youobj);
	    youfind.sendKeys("i love my india songs");
	    
	    By sarch=By.name("butoon");
	    WebElement sar=objch.findElement(sarch);
	    sar.click();
	    
	}
	

}

