package SeliniumPractice;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PradeepSirWork {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		Dimension objDime=driver.findElement(By.name("Login")).getSize();
		int loginHeight=objDime.getHeight();
		int loginWidth=objDime.getWidth();
		int TotalSize=loginHeight+loginWidth; 
		
		System.out.println("Login Button H&W ="+loginHeight+","+loginWidth);
				
		driver.findElement(By.name("Login")).click();
		
		
//		String getText=driver.findElement(By.linkText("Home")).getText();
//		if(getText.contains("Home")) {
//			System.out.println("Home Page has been Appered..");
//		}else {
//			System.out.println("Home Page has not been Appered");
//		}
		
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		if(pagetitle.contains("Home")) {
			System.out.println("Home Page has been Appered..");
		}else {
			System.out.println("Home Page has not been Appered");
		}
		
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		
		List<WebElement> ram = driver.findElements(By.xpath("//td[@class='searchAlph']"));
		for(WebElement t : ram)
		t.click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("campaignname")).sendKeys("Pradeep Sir");
		
		Select objSelect=new Select(driver.findElement(By.xpath("//select[@name='campaigntype']")));
		objSelect.selectByIndex(10);
		
		driver.findElement(By.id("targetaudience")).sendKeys("200");
		driver.findElement(By.id("sponsor")).sendKeys("chandan");
		driver.findElement(By.id("numsent")).sendKeys("50");
		Select selectObj=new Select(driver.findElement(By.name("campaignstatus")));
		selectObj.selectByIndex(2);
		driver.findElement(By.id("targetsize")).sendKeys("35");
		WebElement objWeb=driver.findElement(By.id("budgetcost"));
		objWeb.clear();
		objWeb.sendKeys("500");
		WebElement webObj=driver.findElement(By.id("actualcost"));
		webObj.clear();
		webObj.sendKeys("150");
		
		Select obj2Select=new Select(driver.findElement(By.name("expectedresponse")));
		obj2Select.selectByIndex(2);
		
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
//		driver.findElement(By.xpath("//a[text()='abcd1234']")).click();
		
		WebElement obj2Web=driver.findElement(By.name("expectedrevenue"));
		obj2Web.clear();
		obj2Web.sendKeys("23");
		driver.findElement(By.id("expectedsalescount")).sendKeys("15000");
		driver.findElement(By.id("actualsalescount")).sendKeys("15000");
		driver.findElement(By.id("expectedresponsecount")).sendKeys("500");
		driver.findElement(By.id("actualresponsecount")).sendKeys("500");
		WebElement webRoi=driver.findElement(By.id("expectedroi"));
		webRoi.clear();
		webRoi.sendKeys("9000");
		WebElement Roi=driver.findElement(By.id("actualroi"));
		Roi.clear();
		Roi.sendKeys("9000");
		driver.findElement(By.name("description")).sendKeys("Hello Sir how are you..");
		
		
		driver.findElement(By.name("button")).click();
		
		String form=driver.findElement(By.xpath("//span[text()='Pradeep Sir']")).getText();
		if(form.contains("Sir")) {
			System.out.println("Registration Form Testing is Passed");
		}else {
			System.out.println("Registration Testing is Failed");
		}
		String getCampaingNameText=driver.findElement(By.xpath("//span[text()='Pradeep Sir']")).getText();
		String Expected="Pradeep Sir";
		if(getCampaingNameText.equalsIgnoreCase(Expected)) {
			System.out.println("Campaing Name Testing is Passed");
		}else {
			System.out.println("Campaing name Testing is Failed");
		}
		String ActualcampaignStatus=driver.findElement(By.xpath("//font[text()='Active']")).getText();
		String ExpecteCampaingn="Active";
		if(ActualcampaignStatus.equalsIgnoreCase(ExpecteCampaingn)) {
			System.out.println("CampaignStatus Testing is Passed");
		}else {
			System.out.println("CampaignStatus Testing is Failed");
		}
		String ActualCamType=driver.findElement(By.xpath("//font[text()='Email']")).getText();
		String ExpectedCamType="Email";
		if(ActualCamType.equalsIgnoreCase(ExpectedCamType)) {
			System.out.println("Cam Type Testing is Passed");
		}else {
			System.out.println("Cam Type Testing is Failed");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Bookmarklet')]")).click();
		driver.findElement(By.xpath("//img[@title='Close Window']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3AllMenu.gif']")).click();
driver.findElement(By.xpath("//div[@id='allMenu']//a[@href='index.php?module=SalesOrder&action=index&parenttab=Sales']")).click();
		driver.findElement(By.xpath("//table[@class='level2Bg']//a[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//table[@class='level2Bg']//a[text()='Leads']")).click();
//		driver.findElements(By.xpath("//table[@class='hdrTabBg']//td[@class='small']//a"));
		
	}

}
