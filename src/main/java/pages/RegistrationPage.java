
package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import Base.Keyword;
import utils.WaitFor;

public class RegistrationPage {
	
	static Faker faker= new Faker();
	public static String randommailID=faker.internet().emailAddress();
	public static String password="Simmi@199119";
	
	// Sign in link
    @FindBy(xpath = "//a[@data-test='nav-sign-in']")
    WebElement SigninLink;

    // Register link
    @FindBy(xpath = "//a[text()='Register your account']")
    WebElement RegisterLink;

    // First name
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement Fnametxbx;

    // Last name
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement Lnametxbx;

    // Date of birth
    @FindBy(xpath = "//input[@id='dob']")
    WebElement Datetxbx;

    // Country dropdown
    @FindBy(xpath = "//select[@id='country']")
    WebElement CoutryDrpdwn;

    // Postal code
    @FindBy(xpath = "//input[@id='postal_code']")
    WebElement PostalCodetxbx;

    // House number
    @FindBy(id = "house_number")
    WebElement Housnotxbx;

    // Phone number
    @FindBy(xpath = "//input[@id='phone']")
    WebElement Phnotxbx;

    // Email
    @FindBy(xpath = "//input[@id='email']")
    WebElement Emailtxbx;

    // Password
    @FindBy(xpath = "//input[@id='password']")
    WebElement Passtxbx;

    // Register button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Registerbtn;


    // Constructor
    public RegistrationPage() {

    	PageFactory.initElements(Keyword.driver, this);
    }
    
    public void clickOnSignin()
    {
    	WaitFor.visibilityOfElement(SigninLink);
    	WaitFor.clickable(SigninLink);
    	Keyword.clickOn(SigninLink);
    }
    public void clickOnRegisterLink()
    {
    	WaitFor.visibilityOfElement(RegisterLink);
    	WaitFor.clickable(RegisterLink);
    	Keyword.clickOn(RegisterLink);;
    }
    
    public void enterFname()
    {
    	Keyword.enterText(Fnametxbx,"Ram");
    }
    
    public void enterLname()
    {
    	Keyword.enterText( Lnametxbx,"Avasthi");
    }
    
    public void enterDateOfBirth()
    {
    	Keyword.enterText(Datetxbx, "1998-04-13");
    }
    public void selectCountryFromDrpDwn()
    {
    	WaitFor.visibilityOfElement(CoutryDrpdwn);
    	WaitFor.clickable(CoutryDrpdwn);
    	Keyword.countryDropDown(CoutryDrpdwn, 3);
    }
    
    public void enterPostalCode()
    {
    	WaitFor.visibilityOfElement(PostalCodetxbx);
    	Keyword.enterText(PostalCodetxbx, "500056");
    }
    public void enterHouseNumber()
    {
    	WaitFor.visibilityOfElement(Housnotxbx);
    	Keyword.enterText(Housnotxbx, "42");
    }
    
    //Street,City and state take the values automatically
    
    public void enterPhoneNumber()
    {
    	WaitFor.visibilityOfElement(Phnotxbx);
    	Keyword.enterText(Phnotxbx, "898989090998");
    }
    
    public void enterEmailAddress()
    {
    	WaitFor.visibilityOfElement(Emailtxbx);
    	Keyword.enterText(Emailtxbx,randommailID);
    }
    
    public void enterPassword()
    {
    	WaitFor.visibilityOfElement(Passtxbx);
    	Keyword.enterText(Passtxbx, password);
    }
    
    public void clickOnregsrBtn()
    {
    	WaitFor.visibilityOfElement(Registerbtn);
    	WaitFor.clickable(Registerbtn);
    	Registerbtn.click();
    	WaitFor.urlContains("/auth/login");
    }
}

