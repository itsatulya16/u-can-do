package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fb_assertions {
	
	
	
	
	WebDriver driver;
	
	SoftAssert as=new SoftAssert();
	@BeforeClass
	void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
	}
	
	@Test
	void logoTest() {
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		as.assertTrue(logo.isDisplayed(),"logo is not" );
		System.out.println("me hu na");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		as.assertTrue(login.isEnabled(),"button not work");
		as.assertAll();
	}
	@Test
	void forgotPass() {
		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		as.assertTrue(forgot.isEnabled());
		as.assertAll();
	}
	@Test
	void signup() {
		WebElement signup=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		as.assertTrue(signup.isEnabled());
		as.assertAll();
	}
	
	@Test
	void link() {
		String exp="https://www.facebook.com/login/";
		as.assertEquals(driver.getCurrentUrl(), exp);
		as.assertAll();
	}
	
	
	

}
