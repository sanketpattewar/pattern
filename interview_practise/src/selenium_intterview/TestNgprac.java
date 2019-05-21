package selenium_intterview;


import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Listnerclass.class)
public class TestNgprac extends baseclass{
	
	
	@Test(priority=1,groups= {"sanity","smoke"})
	@Parameters({"url","browser"})
	
	public void SetUp(String url ,String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","S:\\selenium drivers\\chrome driver\\chromedriver.exe");
	       driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","S:\\selenium drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		
			
		}
		
		else {
			System.out.println("enter the valid browser name");
		}
	}
	
	
	@Test(priority=5,groups="sanity")
	public void test()
	{
		System.out.println("first testcase successfull");
	}
	
	@Test(priority=7,groups="smoke")
	public void test2() {
		
		System.out.println("second testcase successfull");
	}
	
	@Test(priority=3,groups={"sanity","smoke"})
	public void test3() {
		System.out.println("third testcase sucessfull");
	}
  
	@Test(priority=4,groups="sanity")
	public void test4() {
		System.out.println("fourth testcase is successfull");
	}
	
	@Test(priority=2,groups={"sanity","smoke"})
	public void test1() 
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hi");
	//	Assert.assertTrue(abc);
		System.out.println("element is present in the dom");
		Assert.assertTrue(false);
		//Robot r= new Robot();
		//r.mouseMove(500, 200);
	//	r.keyPress(KeyEvent.VK_CONTROL);
	//r.keyPress(KeyEvent.VK_T);
	//	r.keyRelease(KeyEvent.VK_CONTROL);
	//	r.keyRelease(KeyEvent.VK_T);
	//	Thread.sleep(3000);
	//	System.out.println("robot test is successful");
		
		
		//r.mouseWheel(5);
		
		
	}

}
	



