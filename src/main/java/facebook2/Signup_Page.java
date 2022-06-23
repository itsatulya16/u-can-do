package facebook2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup_Page {
	
	public Signup_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='firstname']")
	 WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobile;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newPassword;
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement selectday;
	@FindBy(xpath="//select[@name='birthday_month']")
	private	WebElement selectmonth;
	@FindBy(xpath="//select[@name='birthday_year']")
	private	WebElement selectyear;
	@FindBy(xpath="//label[text()='Female']")
	private	WebElement gender;
	
	public void firstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	public void lastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	public void mobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}
	public void newpassword(String password) {
		this.newPassword.sendKeys(password);
	}
	public void selectday(String day) {
	 Select s=new Select(selectday);
	 s.selectByValue(day);
	}
	public void selectmonth(String month) {
		Select s=new Select(selectmonth); 
		s.selectByVisibleText(month);
		}
	public void selectyear(String year) {
		Select s=new Select(selectyear);
		s.selectByValue(year);
	}
	public void gender() {
		gender.click();
	}
	
	
	
	
	
	
}
