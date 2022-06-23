package mercury_tours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mercuryTours.FillData;
import mercuryTours.register;

public class test {
	WebDriver driver;
	FillData data;
	register reg;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");

		driver=new ChromeDriver();
		data=new FillData(driver);
		reg=new register(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	
	@Test (priority=0)
	void launchApp() {
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test(priority=1)
	void clickRegister() throws InterruptedException {
		reg.registerp();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	void filldata() {
		data.firstname("himmatsingh");
		data.lastname("BongaPandit");
		data.phone("1234567891");
		data.selectcountry("INDIA");
	}
	
	

}
