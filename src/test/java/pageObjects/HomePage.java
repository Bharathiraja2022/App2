package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	//WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[contains(text(),'My Account')]")
	WebElement Myaccount;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement ClickRegister;
	
	public void myaccount() {
		Myaccount.click();
	}
	
	public void clickregister() {
		ClickRegister.click();
	}
	
}
