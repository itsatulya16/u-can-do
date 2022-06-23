package facebook2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login {
	
	public Facebook_Login(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement signup;
	
	public void signup() {
		signup.click();
	}

}
