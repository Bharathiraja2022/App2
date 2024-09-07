package testBase;


import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;

public class AccountRegistrationClass extends BaseClass{

		@Test
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
			reg.password(randomeAlphNumeric());
			reg.confirm(randomeAlphNumeric());		
			reg.clickcontinue();
			
		}
		
		
		
	}
	
	
	

