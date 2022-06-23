package facebook2Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import facebook2.Signup_Page;
import util.utility_;

public class Signup_PageTest extends Base2 {
	
	Signup_Page page;
	SoftAssert sof;
	
	@BeforeClass
	
	void setup() {
	  Base2.launch2();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		page=new Signup_Page(driver);
		 sof=new SoftAssert();
	}
	@Test
	void firstname() throws IOException {
		page.firstname(utility_.propert("atul"));
	String exp="https://www.facebook.com/r.php?locale=en_GB&display=page";
		sof.assertEquals(driver.getCurrentUrl(), exp,"baburao");
		sof.assertAll();
	}
	@Test
	void lastname() throws IOException, InterruptedException {
		page.lastname(utility_.propert("savita"));
		Thread.sleep(4000);
	}
	
	@Test
	void mobile() throws IOException {
		page.mobile(utility_.propert("nitin"));
	}
	@Test
	void passwordenter() {
		page.newpassword("kuttekamini@haramkhor");
	}
	@Test
	void gender() {
		page.gender();
	}
	@Test
	void selectday() {
		page.selectday("16");
	}
	@Test
	void selectmonth() {
		page.selectmonth("Apr");
	}
	@Test
	void selectyear() {
		page.selectyear("2000");
	}
	
	

}
