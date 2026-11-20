package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Keyword;
import utils.WaitFor;

public class HandToolProductPage {

	public HandToolProductPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"Claw Hammer\"]")
	WebElement ClawHammerproductimg;
	
	@FindBy(xpath="//button[@id=\"btn-add-to-cart\"]")
	WebElement addTocartbtn;
	
	 // Cart icon and count
    @FindBy(xpath = "//span[@id='lblCartCount']")
    WebElement Addtocarticon;

    // Proceed to checkout buttons
    @FindBy(xpath = "//button[normalize-space()='Proceed to checkout']")
    WebElement Proceedtochkoutbtn1;

    @FindBy(xpath = "//button[@data-test='proceed-2']")
    WebElement Proceedtochkoutbtn2;

    @FindBy(xpath = "//button[@data-test='proceed-3']")
    WebElement Proceedtochkoutbtn3;
    
    // House number
    @FindBy(id = "house_number")
    WebElement Housnotxbx;

    // Payment method dropdown
    @FindBy(xpath = "//select[@id='payment-method']")
    WebElement SelectPaymentMethod;

    // Check payment button
    @FindBy(xpath = "//button[text()=\" Check payment \"]")
    WebElement Checkpayment;

    // Payment successful message
    @FindBy(xpath = "//div[normalize-space()='Payment was successful']/parent::div")
    WebElement PaymentSuccessful;

    // Confirm button
    @FindBy(xpath ="//button[text()=\" Confirm \"]")
    WebElement Confirmbtn;

    // Order confirmation message
    @FindBy(id ="order-confirmation")
	WebElement Thanksbtn;

	
	public void clickOnproductimage()
	{
		
			WaitFor.visibilityOfElement(ClawHammerproductimg);
			WaitFor.clickable(ClawHammerproductimg);
			Keyword.clickOn(ClawHammerproductimg);
	}
	
	public void clickOnaddtocartbtn()
	{
		
			WaitFor.visibilityOfElement(addTocartbtn);
			WaitFor.clickable(addTocartbtn);
			Keyword.clickOn(addTocartbtn);
	}
	
	
	//======================================================//
	
	// Click on cart icon
    public void clickOnCart() {
    	WaitFor.visibilityOfElement(Addtocarticon);
		WaitFor.clickable(Addtocarticon);
        Keyword.clickOn(Addtocarticon);
    }

    // First proceed to checkout
    public void clickOnProceed1() {
    	WaitFor.visibilityOfElement(Proceedtochkoutbtn1);
		WaitFor.clickable(Proceedtochkoutbtn1);
        Keyword.clickOn(Proceedtochkoutbtn1);
    }

    // Second proceed to checkout
    public void clickOnProceed2() {
    	WaitFor.visibilityOfElement(Proceedtochkoutbtn2);
		WaitFor.clickable(Proceedtochkoutbtn2);
        Keyword.clickOn(Proceedtochkoutbtn2);
    }
    public void enterHouseNumber()
    {
    	WaitFor.visibilityOfElement(Housnotxbx);
    	Keyword.enterText(Housnotxbx, "42");
    }

    // Third proceed to checkout
    public void clickOnProceed3() {
    	WaitFor.visibilityOfElement(Proceedtochkoutbtn3);
		WaitFor.clickable(Proceedtochkoutbtn3);
        Keyword.clickOn(Proceedtochkoutbtn3);
      
    }

    // Select payment method
    public void selectPaymentMethod() {
    	WaitFor.visibilityOfElement(SelectPaymentMethod);
		WaitFor.clickable(SelectPaymentMethod);
		Keyword.countryDropDown(SelectPaymentMethod, 2);
    }

    // Click on Check Payment
    public void clickOnCheckPayment() {
    	WaitFor.visibilityOfElement(Checkpayment);
		WaitFor.clickable(Checkpayment);
        Keyword.clickOn(Checkpayment);
    }

    // Click on Confirm button
    public void clickOnConfirm() {
    	WaitFor.visibilityOfElement(Confirmbtn);
		WaitFor.clickable(Confirmbtn);
		Keyword.clickOn(Confirmbtn);
    }
    
    // Get order confirmation message
    public String getOrderConfirmationMessage() {
    	
    	WaitFor.visibilityOfElement(Thanksbtn);
        return Keyword.getText(Thanksbtn);
    }

    public void verifyOrderConfirmationMessage() {
    	 
	    String actualMessage = getOrderConfirmationMessage();

	    Assert.assertTrue(
	        actualMessage.contains("Thanks for your order!"),
	        "Order confirmation message is incorrect. Actual message: " + actualMessage
	    );
	}
	

}
