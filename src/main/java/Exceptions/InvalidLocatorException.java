package Exceptions;

public class InvalidLocatorException extends Error{
	
	public String locator; 
	public InvalidLocatorException(String locator) {
		this.locator = locator;
	}
	
	@Override
	public String getMessage() {
		
		return "Invalid locator"+locator;
	}
	

}
