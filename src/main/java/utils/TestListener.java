package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Keyword;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) 
    {
    		Shutterbug.shootPage(Keyword.driver).save();

            System.out.println("Screenshot captured successfully!");

       
        }
    }
