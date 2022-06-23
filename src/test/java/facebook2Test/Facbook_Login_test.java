package facebook2Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import facebook2.Facebook_Login;

public class Facbook_Login_test extends Base2 {
	Facebook_Login login;
	 
	@BeforeClass
	public void setup() {
		
		Base2.launch2();
		driver.get("https://www.facebook.com/login/web/");
		login=new Facebook_Login(driver);
	}
	
	@Test
	void signupLink() {
		login.signup();
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	

}
