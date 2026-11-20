package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Keyword;


public class WaitFor{
	
	private static WebDriverWait wait;
	
	static 
	{
		wait=new WebDriverWait(Keyword.driver,Duration.ofSeconds(6000));
		wait.pollingEvery(Duration.ofMillis(250));
	}
	
	public static void visibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void clickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void urlContains(String url) {
	    wait.until(ExpectedConditions.urlContains(url));
	}

}
