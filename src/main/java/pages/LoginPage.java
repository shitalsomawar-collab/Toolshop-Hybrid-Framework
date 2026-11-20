package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Keyword;
import utils.WaitFor;

public class LoginPage {
	
	public LoginPage()
	{
		PageFactory.initElements(Keyword.driver, this);
	}
	
	// Login Email
	@FindBy(xpath = "//input[@id='email']")
	WebElement Loginemailtxbx;

	// Password
	@FindBy(xpath = "//input[@type='password']")
	WebElement Passwordtxbx;

	// Login Button
	@FindBy(xpath = "//input[@data-test='login-submit']")
	WebElement Loginbtn;
	
	public void enterEmail()
	{
		WaitFor.visibilityOfElement(Loginemailtxbx);
		Keyword.enterText(Loginemailtxbx, RegistrationPage.randommailID);
	}
	
	public void enterPass()
	{
		WaitFor.visibilityOfElement(Passwordtxbx);
		Keyword.enterText(Passwordtxbx,RegistrationPage.password);
	}
	
	public void clickOnLoginbtn()
	{
		WaitFor.visibilityOfElement(Loginbtn);
    	WaitFor.clickable(Loginbtn);
		Keyword.clickOn(Loginbtn);
		WaitFor.urlContains("/account");
	}

}
