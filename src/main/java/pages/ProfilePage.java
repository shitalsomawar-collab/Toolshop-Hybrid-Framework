package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Keyword;
import utils.WaitFor;

public class ProfilePage {
	public static String password="Simmi@199119";
	public static String NewPassword="Siddhi@119811";
	
	public ProfilePage()
	{
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(xpath = "//input[@id='current-password']")
	WebElement Currentpasstxbx;

	@FindBy(xpath = "//input[@id='new-password']")
	WebElement Newpasstxbx;

	@FindBy(xpath = "//input[@id='new-password-confirm']")
	WebElement Confirmpasstxbx;

	@FindBy(xpath = "//button[normalize-space()='Change Password']")
	WebElement Changbtn;
	
	public void enterCurrentpass()
	{
		WaitFor.visibilityOfElement(Currentpasstxbx);
		Keyword.enterText(Currentpasstxbx,password);
		
	}
	public void enterNewpass()
	{
		WaitFor.visibilityOfElement(Newpasstxbx);
		Keyword.enterText(Newpasstxbx,NewPassword);
		
	}
	public void enterConfirmpass()
	{
		WaitFor.visibilityOfElement(Confirmpasstxbx);
		Keyword.enterText(Confirmpasstxbx,NewPassword);
		
	}
	public void clickonChangeBtn()
	{
		WaitFor.visibilityOfElement(Changbtn);
		WaitFor.clickable(Changbtn);
		Keyword.clickOn(Changbtn);
		WaitFor.urlContains("/auth/login");
	}

}
