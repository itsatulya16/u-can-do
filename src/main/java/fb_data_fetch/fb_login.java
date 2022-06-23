package fb_data_fetch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_login {
	
	
	
	public fb_login(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	
	
	
	public void enterusername(String username) {
		this.username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}
	

}
