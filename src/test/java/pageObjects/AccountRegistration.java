package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage{
	
	public AccountRegistration(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="firstname")
	WebElement Firstname;
	
	@FindBy(name="lastname")
	WebElement LastName;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="telephone")
	WebElement Telephone;
	
	@FindBy(name="password")
	WebElement Password;
	
	
	@FindBy(name="confirm")
	WebElement PasswordConfirm;
	
	@FindBy(name="newsletter")
	WebElement subscribe;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Clickcontinue;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!']")
	WebElement ViewSuccessMessage;
	
	public void firstname(String fname)
	{
		Firstname.sendKeys(fname);
	}
	
	
	public void lastname(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	
	public void email(String email)
	{
		Email.sendKeys(email);
	}
	
	public void telephone(String mob)
	{
		Telephone.sendKeys(mob);
	}
	
	public void password(String pass)
	{
		Password.sendKeys(pass);
	}
	
	
	public void confirm(String confirmpass)
	{
		PasswordConfirm.sendKeys(confirmpass);
	}
	

	public void subscribe()
	{
		subscribe.click();
	}

	public void clickcontinue()
	{
		Clickcontinue.click();
	}
	
	
	
	
}
