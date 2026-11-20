package Exceptions;

public class NoSuchBrowserException extends Error {
	
	private String browserName;
	
	public NoSuchBrowserException (String browserName)
	{
		this.browserName=browserName;
	}
	
	@Override
	public String getMessage()
	{
		return "NO such browser:"+ browserName;
	}

}
