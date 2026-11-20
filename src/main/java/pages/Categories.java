package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Keyword;
import utils.WaitFor;

public class Categories {

	public Categories() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(xpath="//button[text()=\" Categories \"]")
	WebElement Categoriesbtn;
	
	@FindBy(xpath="//a[text()=\"Hand Tools\"]")
	WebElement Handtoolsbtn;
	
	@FindBy(xpath="//a[text()=\"Power Tools\"]")
	WebElement Powertoolsbtn;
	
	@FindBy(xpath="//a[text()=\"Other\"]")
	WebElement Otherbtn;
	
	@FindBy(xpath="//a[text()=\"Special Tools\"]")
	WebElement SpecialToolsbtn;
	
	@FindBy(xpath="//a[text()=\"Rentals\"]")
	WebElement Rentalsbtn;
	
	public void clickonCategoriesBtn()
	{
		WaitFor.visibilityOfElement(Categoriesbtn);
		WaitFor.clickable(Categoriesbtn);
		Keyword.clickOn(Categoriesbtn);
	}
	
	public void clickonHandToolsBtn()
	{
		WaitFor.visibilityOfElement(Handtoolsbtn);
		WaitFor.clickable(Handtoolsbtn);
		Keyword.clickOn(Handtoolsbtn);
	}
	
	public void clickonPowerToolsBtn()
	{
		WaitFor.visibilityOfElement(Powertoolsbtn);
		WaitFor.clickable(Powertoolsbtn);
		Keyword.clickOn(Powertoolsbtn);
	}
	
	public void clickonOtherBtn()
	{
		WaitFor.visibilityOfElement(Otherbtn);
		WaitFor.clickable(Otherbtn);
		Keyword.clickOn(Otherbtn);
	}
	
	public void clickonSpecialToolsBtn()
	{
		WaitFor.visibilityOfElement(SpecialToolsbtn);
		WaitFor.clickable(SpecialToolsbtn);
		Keyword.clickOn(SpecialToolsbtn);
	}
	
	public void clickonRentalsBtn()
	{
		WaitFor.visibilityOfElement(Rentalsbtn);
		WaitFor.clickable(Rentalsbtn);
		Keyword.clickOn(Rentalsbtn);
	}

}
