package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base.Keyword;
import Base.SetupDriver;
import pages.LoginPage;
import utils.WaitFor;

public class LoginTest extends SetupDriver {
	
	LoginPage loginpage;
	@Test
	public void loginWithValidCredentials()
	{
		loginpage=new LoginPage();
		loginpage.enterEmail();
		loginpage.enterPass();
		loginpage.clickOnLoginbtn();
		
		assertEquals(Keyword.driver.getCurrentUrl(),"https://practicesoftwaretesting.com/account");
		
	}

}
