package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base.Keyword;
import Base.SetupDriver;
import pages.AccountPage;
import pages.ProfilePage;

public class ProfileTest extends SetupDriver  {
	@Test(enabled=false)
	public void changePassword()
	{
		AccountPage accountpage= new AccountPage();
		ProfilePage profilepage=new ProfilePage();
		
		accountpage.clickonProfileIcon();
		accountpage.clickonprofileLink();
		profilepage.enterCurrentpass();
		profilepage.enterNewpass();
		profilepage.enterConfirmpass();
		profilepage.clickonChangeBtn();
		
		assertEquals(Keyword.driver.getCurrentUrl(),
	                "https://practicesoftwaretesting.com/auth/login");
	}

}
