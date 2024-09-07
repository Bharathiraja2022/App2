package testCases;


import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class AccountLogin extends BaseClass{
@Test(groups= {"Sanity"})
	public void verify_account_login() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		logger.info("Starting Account registration");
		LoginPage lp=new LoginPage(driver);
		logger.info("Clicked on login");
		lp.Clicklogin();
		Thread.sleep(1000);
		logger.info("Enter email");
		lp.EnterEmail(p.getProperty("email"));
		logger.info("Enter password");
		lp.EnterPassword(p.getProperty("password"));
		logger.info("Click login CTA");
		lp.ClickloginCTA();
		
		
}
}