package cde;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class NewTest  {
  @Test(priority=1)
  public void test1() {
	  
	  System.out.println("hi");
	  
  }
  
  @Test(priority=2)
  public void test2(){
	  System.out.println("hello1");
  }
 @Test(priority=3)
 public void test3(){
	 
	 Assert.assertTrue(true);
  }

}