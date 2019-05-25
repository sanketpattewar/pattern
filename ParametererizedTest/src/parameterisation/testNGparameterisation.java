package parameterisation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(LISTNER.class)
public class testNGparameterisation {
	
 public static WebDriver driver ;
 

@Test(priority=1,groups= {"sanity","smoke"})

@Parameters("Browsername")
public void selectBrowser(String Browsername) {
	
	if(Browsername.equalsIgnoreCase("chrome")) 
	{
		 System.out.println("Opening the chromebrowser");
		 System.setProperty("webdriver.chrome.driver", "S:\\selenium drivers\\chrome driver\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	
	
	else if (Browsername.equalsIgnoreCase("firefox")) 
    {
	     System.out.println("Opening the Firefoxbrowser");
		 System.setProperty("webdriver.gecko.driver", "S:\\selenium drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		 driver= new FirefoxDriver();
    }
	
	else
	{
		 System.out.println("Enter the Browsername");
	}

	 // driver.get("http://www.facebook.com");
	  // driver.get("http://www.spicejet.com");
	  //   driver.manage().window().maximize();	
}
/*
@Test(priority=1)
public void SetUp() {
	
	// driver.get("http://www.facebook.com");
	  // driver.get("http://www.spicejet.com");
	 //driver.manage().window().maximize();
	 //driver.manage().deleteAllCookies();
	 //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 }*/
 
 
 @Test(priority=2,groups= {"sanity","smoke"})
 @Parameters({"Username","Password"})
 public void logintest(String Username,String Password) 
 {
	 driver.get("http://www.facebook.com");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.findElement(By.name("email")).sendKeys(Username);
	 driver.findElement(By.name("pass")).sendKeys(Password);
	 driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
	 
	 
 }
 @Test(priority=3)
 public void secondtestcase() {
	 System.out.println("second testcase is passed");
 }
 
 @Test(priority=4,groups= {"sanity","smoke"})
 public void spicejettesting() {
	 driver.navigate().to("http://www.spicejet.com");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	 
 }
 @Test(priority=5,groups= {"smoke"})
   public void urlecheck() {
    String url=driver.getCurrentUrl();
    System.out.println("url is :"+url);
	Assert.assertEquals(url, "https://www.spicejet.com/", "check the url " );
	
 }
 
 @Test(priority=6,groups= {"smoke"})
  public void titlecheck() {
	 String title=driver.getTitle();
	 System.out.println("title of the page is "+title);
	 Assert.assertEquals(title, "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
	 
 }
 @Test(priority=7,groups= {"smoke"})
 public void handlecheck() {
	 
	 String handle=driver.getWindowHandle();
	 System.out.println("handle of the page is:"+handle); 
	 
}
 
 @Test(priority=8,groups= {"sanity"})
 
 
 public void radioOneWay() {
	boolean a= driver.findElement(By.xpath("(//input[@value='OneWay'])[1]")).isSelected();
	boolean b=driver.findElements(By.xpath("(//input[@value='OneWay'])[1]")).size()!=0;
	Assert.assertTrue(b);
	System.out.println("the button is present in a dom");
	System.out.println("status of the button is"+a);
	Assert.assertTrue(a);
	System.out.println("button is selected");
	
	boolean a1 =driver.findElement(By.xpath("(//input[@value='OneWay'])[1]")).isEnabled();
	System.out.println(a1);
	
    boolean a2 =driver.findElement(By.xpath("(//input[@value='OneWay'])[1]")).isDisplayed();
    System.out.println(a2);
	
}
 
@Test(priority=9,groups= {"sanity"})

 public void radio_RoundTrip() {
	driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
	boolean b= driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isSelected();
	System.out.println("status of the button is"+b);
	Assert.assertTrue(b);
	System.out.println("button is selected");
	
	boolean b1 =driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isEnabled();
	System.out.println(b1);
	
    boolean b2 =driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isDisplayed();
    System.out.println(b2);
	
}

@Test(priority=10,groups={"sanity"},enabled=false)

 public void radio_Multicity() {
	System.out.println("entered in multicity buttontesting");
	driver.findElement(By.xpath("(//input[@value='TripPlanner'])[1]")).click();
	boolean c= driver.findElement(By.xpath("(//input[@value='TripPlanner'])[1]")).isSelected();
	System.out.println("status of the button is"+c);
	Assert.assertTrue(c);
	System.out.println("button is selected");
	
	boolean c1 =driver.findElement(By.xpath("(//input[@value='TripPlanner'])[1]")).isEnabled();
	System.out.println(c1);
	
    boolean c2 =driver.findElement(By.xpath("(//input[@value='TripPlanner'])[1]")).isDisplayed();
    System.out.println(c2);
   
}

@Test(priority=11,groups={"sanity"},enabled=true)
public void radiobuttonclicking() {
	for(int i=0;i<3;i++) {
	driver.findElements(By.xpath("//input[ @type='radio']")).get(i).click();
	}
	
}
	 
 @Test(priority=12,groups= {"sanity","smoke"})
	public void TearDown(){
		driver.quit();
	}

}
