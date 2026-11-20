package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.SetupDriver;
import pages.Categories;
import pages.HandToolProductPage;

public class HandToolProductTest extends SetupDriver {
	
	@Test
	public void verifyAddItemToCartandcheckout()
	{
		Categories categories= new Categories();
		HandToolProductPage productpage=new HandToolProductPage();
		
		
		categories.clickonCategoriesBtn();
		categories.clickonHandToolsBtn();
		productpage.clickOnproductimage();
		productpage.clickOnaddtocartbtn();
		productpage.clickOnCart();
		productpage.clickOnProceed1();
		productpage.clickOnProceed2();
		productpage.enterHouseNumber();
		productpage.clickOnProceed3();
		productpage.selectPaymentMethod();
		productpage.clickOnCheckPayment();
		productpage.clickOnConfirm();
		productpage.verifyOrderConfirmationMessage();
		
		
		
		
	}

}
