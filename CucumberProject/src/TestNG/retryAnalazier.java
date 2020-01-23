package TestNG;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;


public class retryAnalazier implements IRetryAnalyzer {

	  int retryCount = 0;
	  static final int maxRetryCount = 3;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	
}
