package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlyBase {
	
	public static WebDriver driver;
	
	
	public static void setting(String Crossbrowser) {
		if(Crossbrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");
		driver=new ChromeDriver();
		
		}
		else if(Crossbrowser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "path of gecko driver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/web/");
		
	}

}
