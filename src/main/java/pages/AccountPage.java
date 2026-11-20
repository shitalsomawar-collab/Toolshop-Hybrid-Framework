package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Keyword;
import utils.WaitFor;

public class AccountPage {
	public AccountPage()
	{
		PageFactory.initElements(Keyword.driver, this);
	}
	// All locators for menu dropdown
	@FindBy(xpath = "//button[@id=\"menu\"]")
	WebElement Profileicon;
	
	@FindBy(xpath = "//a[@data-test='nav-profile']/child::fa-icon")
	WebElement MyProfilebtn;
	
	@FindBy(xpath="//a[text()=\"My favorites\"]")
	WebElement MyFavouritebtn;
	
	@FindBy(xpath="//a[@data-test=\"nav-my-invoices\"]")
	WebElement MyInvoicebtn;
	
	@FindBy(xpath="//a[@data-test=\"nav-my-messages\"]")
	WebElement MyMessagesbtn;
	
	
	
	
	
	//All methods of dropdown when you click on name you register
	public void clickonProfileIcon()
	{
		WaitFor.visibilityOfElement(Profileicon);
		WaitFor.clickable(Profileicon);
		Keyword.clickOn(Profileicon);
		
	}
	
	public void clickonprofileLink()
	{
		WaitFor.visibilityOfElement(MyProfilebtn);
		WaitFor.clickable(MyProfilebtn);
		Keyword.clickOn(MyProfilebtn);
		
	}
	
	public void clickonFavouriteLink()
	{
		WaitFor.visibilityOfElement(MyFavouritebtn);
		WaitFor.clickable(MyFavouritebtn);
		Keyword.clickOn(MyFavouritebtn);
		
	}
	
	public void clickonMyinvoiceLink()
	{
		WaitFor.visibilityOfElement(MyInvoicebtn);
		WaitFor.clickable(MyInvoicebtn);
		Keyword.clickOn(MyInvoicebtn);
		
	}
	
	public void clickonMyMessagesLink()
	{
		WaitFor.visibilityOfElement(MyMessagesbtn);
		WaitFor.clickable(MyMessagesbtn);
		Keyword.clickOn(MyMessagesbtn);
		
	}

	

	
	
	

}
