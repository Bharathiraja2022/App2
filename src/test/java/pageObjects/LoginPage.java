package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement ClickLogin;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement ClickLoginCTA;
	
	
	public void Clicklogin() {
		ClickLogin.click();
	}
	
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	public void EnterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	
	public void ClickloginCTA() {
		ClickLoginCTA.click();
	}
}
