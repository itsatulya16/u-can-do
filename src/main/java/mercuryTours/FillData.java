package mercuryTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillData {
	public FillData(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//select[@name='country']")
	WebElement selectcountry;
	
	public void firstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	public void lastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	public void phone(String phone) {
		this.phone.sendKeys(phone);
	}
	
	
	
	public void selectcountry(String country) {

		Select s=new Select(selectcountry);
		s.selectByValue(country);
		}
		
	}
	


