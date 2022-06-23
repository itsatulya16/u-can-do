package cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoDarling {
	WebDriver driver;
	@BeforeMethod
	@Parameters ("browser")
	public void setup(String browser) throws InterruptedException {
		if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
		}
		else if(browser.equals("fire")) {
			System.out.println("firefox opened");
		}
	}
	
	@Test
	public void test() {
		driver.get("www.google.com");
		System.out.println("chrome launched successfully");
	}
	

}
