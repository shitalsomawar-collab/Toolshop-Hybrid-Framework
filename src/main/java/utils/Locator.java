package utils;

public interface Locator 
{
	//Register user
	String SigninLink="xpath##//a[@data-test=\"nav-sign-in\"]";
	String RegisterLink="xpath##//a[text()=\"Register your account\"]";
	String Fnametxbx="xpath##//input[@id=\"first_name\"]";
	String Lnametxbx="xpath##//input[@id=\"last_name\"]";
	String Datetxbx="xpath##//input[@id=\"dob\"]";
	String CoutryDrpdwn="xpath##//select[@id=\"country\"]";
	String PostalCodetxbx="xpath##//input[@id=\"postal_code\"]";
	String Housnotxbx="id##house_number";
	String Phnotxbx="xpath##//input[@id=\"phone\"]";
	String Emailtxbx="xpath##//input[@id=\"email\"]";
	String Passtxbx="xpath##//input[@id=\"password\"]";
	String Registerbtn="xpath##//button[@type=\"submit\"]";
	String Loginemailtxbx="xpath##//input[@id=\"email\"]";
	String Passwordtxbx="xpath##//input[@type=\"password\"]";
	String Loginbtn="xpath##//input[@data-test=\"login-submit\"]";
	
	//update password
	String ProfileLink="xpath##//a[@data-test=\"nav-profile\"]/child::fa-icon";
	String Currentpasstxbx="xpath##//input[@id=\"current-password\"]";
	String Newpasstxbx="xpath##//input[@id=\"new-password\"]";
	String Confirmpasstxbx="xpath##//input[@id=\"new-password-confirm\"]";
	String Changbtn="xpath##//button[text()=\"Change Password \"]";
	
	//add to cart
	String Categorybtn="xpath##//button[text()=\" Categories \"]";
	String HandToolsopt="xpath##//a[text()=\"Hand Tools\"]";
	//String Hammerchckbx="xpath## //input[contains(@data-test,'9HHAKQ')]";
	String SelectedItemClawHammer="xpath##//img[@alt=\"Claw Hammer\"]";
	String AddtoCartbtn="xpath##//button[@id=\"btn-add-to-cart\"]";
	String Addtocarticon="xpath##//span[@id=\"lblCartCount\"]";
	String ProductAddes="xpath##//span[@data-test=\"product-title\"]";
	
	// payment 
	String Proceedtochkoutbtn1="xpath##//button[text()=\"Proceed to checkout\"]";
	String Proceedtochkoutbtn2="xpath##//button[@data-test=\"proceed-2\"]";
	String Proceedtochkoutbtn3="xpath##//button[@data-test=\"proceed-3\"]";
	String SelectPaymentMethod="xpath##//select[@id=\"payment-method\"]";
	String Checkpayment="xpath##//button[text()=\" Check payment \"]";
	String PaymentSuccessful="xpath##//div[text()=\"Payment was successful\"]/parent::div";
	String Confirmbtn="xpath##//button[@data-test=\"finish\"]";
	String Thanksbtn="id##order-confirmation";
		
	// Favorites 
	String AddtoFavouritesbtn="xpath##//button[@id=\"btn-add-to-favorites\"]";
	String Profiledrpdwnbtn="xpath##//button[@id=\"menu\"]";
	String Myfavouriteslink="xpath##//a[text()=\"My favorites\"]";
	String SelectedItemClawHammerimg="xpath##//h5[@data-test=\"product-name\"]";
	
	// fill contact form
	String ContactLink="xpath##//a[@href=\"/contact\"]";
	String Fnametxbx1="xpath##//input[@id=\"first_name\"]";
	String Lnametxbx1="xpath##//input[@id=\"last_name\"]";
	String Emailtxbx1="xpath##//input[@id=\"email\"]";
	String Selectsubjectdrpdwn="xpath##//select[@id=\"subject\"]";
	String Writemsgtxtarea="xpath##//textarea[@id=\"message\"]";
	String Contactsendbtn="xpath##//input[@data-test=\"contact-submit\"]";
	String Textaftersendbtn = "xpath##//div[contains(text(),'Thanks for your message!')]";
	
	//generate invoice
	String MyinvoicesLink="xpath##//a[@data-test=\"nav-my-invoices\"]";
	String Detailsbtn="xpath##//a[text()=\"Details\"]";
	String InvoiceprdctName="xpath##//tbody//tr//td[contains(text(),\"Claw Hammer\")]";
	
	String MymessagesLink="xpath##//a[@data-test=\"nav-my-messages\"]";
	String Message="xpath##//p[@class=\"card-text\"]";
	
	
	
}
