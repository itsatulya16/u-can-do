package crossBrowserTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook2.Facebook_Login;

public class OnlyTest extends OnlyBase{
	
	Facebook_Login logi;
	
	
	@BeforeClass
	@Parameters("Crossbrowser")
	void launch() {
		OnlyBase.setting("Crossbrowser");
		
		
		logi=new Facebook_Login(driver);
		
	}
	@Test
	void login() {
		
		logi.signup();
	}
	
	

}
