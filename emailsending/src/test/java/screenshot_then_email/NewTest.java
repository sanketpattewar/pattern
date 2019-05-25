package screenshot_then_email;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("hello");
       Assert.assertTrue(false);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("method is starting");
	  
  }

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  System.out.println("result is failing");
	  }
  }

}
