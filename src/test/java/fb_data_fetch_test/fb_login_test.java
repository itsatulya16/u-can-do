package fb_data_fetch_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import fb_data_fetch.fb_login;
import util.utility_;

public class fb_login_test extends base {
	fb_login login;
	utility_ ut;
	String expectedUrl="https://www.facebook.com/login.php/";
	SoftAssert sof;
	@BeforeClass
	void launchBrowser() {
		base.setup();
		login=new fb_login(driver);
		ut=new utility_(driver);
		sof=new SoftAssert();
	}
	@Test
	void launchApp() {
		
		driver.get("https://www.facebook.com/login.php/");
		Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
		Assert.assertEquals(false, false);
		Assert.assertTrue(true);
		System.out.println("success");
		
	}
	@Test
	void username() throws EncryptedDocumentException, IOException  {
		login.enterusername(ut.fetchdata(0, 0));
		sof.assertEquals(false, false);
		
	}
	@AfterMethod
	void verify() throws IOException  {
		ut.screenshot("passtest");
		
	}

}
