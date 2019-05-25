package selenium_intterview;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hashmap1 {
	
 public WebDriver driver ;
 public String chromepath ="S:\\selenium drivers\\chrome driver\\chromedriver.exe" ;
 public String url = "http://www.facebook.com" ;
 
 
 @BeforeMethod
 
 public void Setup()
 {
	  System.setProperty("webdriver.chrome.driver",chromepath);
	  driver = new ChromeDriver () ;
	  driver.get(url);
	  driver.manage().window().maximize();
	 
 }
 
@Test()
public void loginfacebook() throws InterruptedException {
	
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Hashmap.mapdata().get("user_emailId"));
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Hashmap.mapdata().get("user_pass"));
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	   
	
	Thread.sleep(5000);
	
    String Actual = driver.getTitle();
    String Expected =" (2) Facebook" ;
    
    Assert.assertEquals(Actual, Expected);
    
    System.out.println("page is successfully  loging ");
}


@AfterTest 
public void TearDown() {
	
	driver.close();
}
}
