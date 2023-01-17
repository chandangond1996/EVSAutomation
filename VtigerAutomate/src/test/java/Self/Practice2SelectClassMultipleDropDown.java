package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2SelectClassMultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://jsbin.com/osebed/2");
		 WebElement drdw=driver.findElement(By.xpath("//select[@id='fruits']"));
		 Select sl=new Select(drdw);
		 sl.selectByIndex(1);
		 sl.selectByIndex(2);
		 sl.selectByIndex(3);
		 sl.selectByIndex(2);
	}

}
