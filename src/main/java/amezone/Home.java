package amezone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	
	public Home(WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement drop;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement signin;

	
	public void drop() {
		this.drop.sendKeys("baburao");
		
		
	}
	public void sign() {
		this.signin.click();
	}
}
