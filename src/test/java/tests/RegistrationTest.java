package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base.Keyword;
import Base.SetupDriver;
import pages.RegistrationPage;
import utils.WaitFor;


public class RegistrationTest extends SetupDriver 
{
	@Test
	public void registrationTest() throws InterruptedException {

        RegistrationPage regsterPage = new RegistrationPage();
        regsterPage.clickOnSignin();
        regsterPage.clickOnRegisterLink();
        regsterPage.enterFname();
        regsterPage.enterLname();
        regsterPage.enterDateOfBirth();
        regsterPage.selectCountryFromDrpDwn();
        regsterPage.enterPostalCode();
        regsterPage.enterHouseNumber();
        regsterPage.enterPhoneNumber();
        regsterPage.enterEmailAddress();
        regsterPage.enterPassword();
        regsterPage.clickOnregsrBtn();
       

        assertEquals(Keyword.driver.getCurrentUrl(),
                "https://practicesoftwaretesting.com/auth/login");
        
    }
}


