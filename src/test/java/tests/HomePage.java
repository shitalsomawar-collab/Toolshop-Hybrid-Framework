package tests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.github.javafaker.Faker;
import Base.Keyword;
import Base.SetupDriver;
import Exceptions.InvalidLocatorException;
import Exceptions.NoSuchBrowserException;
import utils.Locator;

@Listeners(utils.TestListener.class)
public class HomePage extends SetupDriver {
	Keyword key =new Keyword();
	public static Faker faker=new Faker();
	public static String randomEmail = faker.internet().emailAddress();
	//String email="Amul123@gmail.com";
	public static String password="Simmi@199119";
	public static String ChangedPassword="Siddi@119811";
	public static String randommsg=faker.lorem().characters(50,100);
	public static String text="Thanks for your order!";
	public static String produName="Claw Hammer";
	
	
	@Test(priority=1)
	public void verifySigninandRegister() throws NoSuchBrowserException, InvalidLocatorException, InterruptedException
	{
		
		Thread.sleep(5000);
		key.ClickOn(Locator.SigninLink);
		Thread.sleep(5000);
		key.ClickOn(Locator.RegisterLink);
		key.enterText(Locator.Fnametxbx,"Samaira");
		key.enterText(Locator.Lnametxbx, "Sharma");
		key.enterText(Locator.Datetxbx,"1998-06-23");
		key.ClickOn(Locator.CoutryDrpdwn);
		key.selectElement(Locator.CoutryDrpdwn,5);
		//Thread.sleep(3000);
		
		//System.out.println("Hello");
		key.enterText(Locator.PostalCodetxbx, "2000634");
		key.enterText(Locator.Housnotxbx, "55");
		Thread.sleep(6000);
		key.enterText(Locator.Phnotxbx, "8881212345");
		key.enterText(Locator.Emailtxbx,randomEmail);
		key.enterText(Locator.Passtxbx,password );
		key.ClickOn(Locator.Registerbtn);
		Thread.sleep(4000);
		assertEquals(key.driver.getCurrentUrl(),"https://practicesoftwaretesting.com/auth/login");
	}
	
	@Test(priority=2)
	public void verifyLoginWithValidCredentials() throws InvalidLocatorException, InterruptedException
	{
		//key.openUrl("https://practicesoftwaretesting.com/auth/login");
		Thread.sleep(3000);
		key.enterText(Locator.Loginemailtxbx, randomEmail);
		Thread.sleep(3000);
		key.enterText(Locator.Passwordtxbx, password);
		key.ClickOn(Locator.Loginbtn);
		Thread.sleep(3000);
		assertEquals(key.driver.getCurrentUrl(),"https://practicesoftwaretesting.com/account");
	}
	
	@Test(priority=3,enabled=false)
	public void verifyConfirmPassword() throws InvalidLocatorException, InterruptedException
	{
		key.ClickOn(Locator.ProfileLink);
		Thread.sleep(3000);
		key.enterText(Locator.Currentpasstxbx,password);
		Thread.sleep(3000);
		key.enterText(Locator.Newpasstxbx,ChangedPassword);
		Thread.sleep(3000);
		key.enterText(Locator.Confirmpasstxbx,ChangedPassword);
		Thread.sleep(3000);
		key.ClickOn(Locator.Changbtn);
		Thread.sleep(8000);
		assertEquals(key.driver.getCurrentUrl(),"https://practicesoftwaretesting.com/auth/login");
	}
	@Test(priority=4,enabled=false)
	public void verifyLoginWithChangedPassword() throws InvalidLocatorException, InterruptedException
	{
		//key.openUrl("https://practicesoftwaretesting.com/auth/login");
		Thread.sleep(3000);
		key.enterText(Locator.Loginemailtxbx, randomEmail);
		Thread.sleep(3000);
		key.enterText(Locator.Passwordtxbx, ChangedPassword);
		key.ClickOn(Locator.Loginbtn);
		Thread.sleep(3000);
		assertEquals(key.driver.getCurrentUrl(),"https://practicesoftwaretesting.com/account");
	}
	
	@Test(priority=5,enabled=false)
	public void verifyAddItemToCart() throws InvalidLocatorException, InterruptedException
	{
		Thread.sleep(4000);
		key.ClickOn(Locator.Categorybtn);
		//Thread.sleep(5000);
		key.ClickOn(Locator.HandToolsopt);
		Thread.sleep(6000);
		key.ClickOn(Locator.SelectedItemClawHammer);
		Thread.sleep(4000);
		key.ClickOn(Locator.AddtoCartbtn);
		Thread.sleep(7000);
		key.ClickOn(Locator.Addtocarticon);
		Thread.sleep(5000);
		assertEquals(key.getText(Locator.ProductAddes),"Claw Hammer ");
	}
	
	//@Test(priority=6,enabled=false)
	public void verifyProceedToCheckout () throws InterruptedException, InvalidLocatorException
	{
		Thread.sleep(4000);
		key.ClickOn(Locator.Proceedtochkoutbtn1);
		
		Thread.sleep(7000);
		key.ClickOn(Locator.Proceedtochkoutbtn2);
		
		Thread.sleep(6000);
		key.enterText(Locator.Housnotxbx,"42");
		
		Thread.sleep(8000);
		key.ClickOn(Locator.Proceedtochkoutbtn3);
		
		Thread.sleep(5000);
		key.ClickOn(Locator.SelectPaymentMethod);
		
		Thread.sleep(8000);
		key.selectElement(Locator.SelectPaymentMethod, 2);
		
		Thread.sleep(3000);
		key.ClickOn(Locator.Checkpayment);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.Confirmbtn);
		
		 Thread.sleep(8000);
		 assertEquals(key.getText(Locator.Thanksbtn).contains("Thanks for your order!"),text.contains("Thanks for your order!"));
		
	}
	//@Test(priority=7,enabled=false,dependsOnMethods = ("verifyProceedToCheckout"))
	public void verifyInvoiceIsGenarated() throws InterruptedException, InvalidLocatorException
	{
		Thread.sleep(8000);
		key.ClickOn(Locator.Profiledrpdwnbtn);
		
		Thread.sleep(8000);
		key.ClickOn(Locator.MyinvoicesLink);
		
		Thread.sleep(8000);
		key.ClickOn(Locator.Detailsbtn);
		
		Thread.sleep(9000);
		assertEquals(key.getText(Locator.InvoiceprdctName).contains("Claw Hammer"),produName.contains("Claw Hammer"));
		
	}
	
	@Test(priority=8,enabled=false)
	public void verifyItemAddedtoFavourites() throws InvalidLocatorException, InterruptedException
	{
		Thread.sleep(4000);
		key.ClickOn(Locator.Categorybtn);
		
		//Thread.sleep(5000);
		key.ClickOn(Locator.HandToolsopt);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.SelectedItemClawHammer);
		
		Thread.sleep(8000);
		key.ClickOn(Locator.AddtoFavouritesbtn);
		
		Thread.sleep(7000);
		key.ClickOn(Locator.Profiledrpdwnbtn);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.Myfavouriteslink);
		
		Thread.sleep(8000);
		assertEquals(key.getText(Locator.SelectedItemClawHammerimg),"Claw Hammer");
		
	}
	@Test(priority=9,enabled=true)
	public void verifyContactField() throws InterruptedException, InvalidLocatorException
	{
		Thread.sleep(3000);
		key.ClickOn(Locator.ContactLink);
		
		/*
		 * Thread.sleep(6000); key.enterText(Locator.Fnametxbx1,"Samaira");
		 * 
		 * Thread.sleep(6000); key.enterText(Locator.Lnametxbx1,"Sharma");
		 * 
		 * Thread.sleep(6000); key.enterText(Locator.Emailtxbx1,randomEmail);
		 */
		
		Thread.sleep(6000);
		key.selectElement(Locator.Selectsubjectdrpdwn, 2);
		
		Thread.sleep(6000);
		key.enterText(Locator.Writemsgtxtarea, randommsg);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.Contactsendbtn);
		
		Thread.sleep(6000);
		assertEquals(key.getText(Locator.Textaftersendbtn),"Thanks for your mesage! We will contact you shortly.");
	
		
	}

	@Test(priority=10,enabled=false)
	public void verifyMymessages () throws InterruptedException, InvalidLocatorException
	{
		Thread.sleep(6000);
		key.ClickOn(Locator.Profiledrpdwnbtn);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.MymessagesLink);
		
		Thread.sleep(6000);
		key.ClickOn(Locator.Detailsbtn);
		
		Thread.sleep(6000);
		assertEquals(key.getText(Locator.Message),randommsg);
	}	
	
	
	
	

}
