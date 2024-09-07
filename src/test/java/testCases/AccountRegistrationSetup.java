package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationSetup extends BaseClass{

	
		@Test(groups= {"Regression","Master"})

		public void verify_account_registration()
		{
			HomePage hp=new HomePage(driver);
			hp.myaccount();
			logger.info("Starting Account registration");
			hp.clickregister();
			logger.info("Clicked on ");
			AccountRegistration reg=new AccountRegistration(driver); 
			reg.firstname(randomeString());
			reg.lastname(randomeString());
			reg.email(randomeString()+"@gmail.com");
			reg.telephone(randomeNumeric());
			String password=randomeAlphNumeric();
			reg.password(password);
			reg.confirm(password);		
			reg.clickcontinue();
			
		}
}
