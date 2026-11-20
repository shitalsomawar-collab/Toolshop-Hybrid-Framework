package Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import Exceptions.NoSuchBrowserException;

public class SetupDriver {
	
	Keyword key=new Keyword();
	@BeforeSuite
	public void setup() throws NoSuchBrowserException
	{
		key.openBrowser("Chrome");
		key.openUrl("https://practicesoftwaretesting.com/");
	}
	
	@AfterSuite
	public void tearDown()
	{
		key.closeBrowser();
	}

}
