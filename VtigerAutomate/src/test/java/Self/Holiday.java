package Self;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Holiday {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Hello");
		}

	}

}
