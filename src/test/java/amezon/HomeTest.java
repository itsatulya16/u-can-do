package amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amezone.Home;

public class HomeTest  {
	Home h;
	WebDriver driver;
	@BeforeClass
	public void settt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		h=new Home(driver);
	}
	
	@Test
	void dropd() {
		h.drop();
		
	}
	@Test
	void sig() {
		h.sign();
	}

}
