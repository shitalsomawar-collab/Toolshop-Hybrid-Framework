package Base;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import Exceptions.InvalidLocatorException;
import Exceptions.NoSuchBrowserException;

public class Keyword {
	
	public static RemoteWebDriver driver;
	
	public void openBrowser(String browser) throws NoSuchBrowserException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new NoSuchBrowserException(browser);
		}
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
		//driver.manage().window().maximize();
	}
	
public static WebElement getElement(String locator) throws InvalidLocatorException
	
	{
		String locatorType=locator.split("##")[0];
		String locatorValue=locator.split("##")[1];
		
		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("className")) {
			return driver.findElement(By.className(locatorValue));
		}
		 else if (locatorType.equalsIgnoreCase("cssSelector")) {
			 return driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linkText")) {
			return driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			return driver.findElement(By.partialLinkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			return driver.findElement(By.tagName(locatorValue));
		}
		 else {
			 throw new InvalidLocatorException(locator);
		    }
	}
 
	public static void ClickOn(String locator ) throws InvalidLocatorException
	{
		
		getElement(locator).click();
		
	}
	
	public static void enterText(String locator,String text) throws InvalidLocatorException
	{
		getElement(locator).sendKeys(text);;
		
	}
	
	public static void selectElement(String locator,int index) throws InvalidLocatorException
	{
		
		Select country=new Select(Keyword.getElement(locator));
	    country.selectByIndex(index);
	
	}
	
	public static String getText(String locator) throws InvalidLocatorException
	{
		return getElement(locator).getText();
		
	}
	
	//=====================================================================================//
	
	public static void clickOn(WebElement element)
	{
		element.click();
	}
	
	public static void enterText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public static void countryDropDown(WebElement element,int index)
	{
		element.click();
		Select sc= new Select(element);
		sc.selectByIndex(index);
				
	}
	
	public static String getText(WebElement element)
	{
		return element.getText();
	}
	
	
	
	
	
	
	
}
