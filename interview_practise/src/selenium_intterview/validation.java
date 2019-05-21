package selenium_intterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class validation {

	public static WebDriver driver ;
	@Test(priority=1)
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\selenium drivers\\chrome driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Facebook.com");
		Thread.sleep(3000);
		}
	@Test(priority=2)
	public void setup1() throws InterruptedException{
		
	int x =driver.findElement(By.name("email")).getLocation().getX();
	System.out.println(x);
	int hight_x =      driver.findElement(By.name("email")).getSize().getHeight();
	System.out.println(hight_x);
	int wid=     driver.findElement(By.name("email")).getSize().getWidth();
	System.out.println(wid);
	
	//to check whaether the usernam and password box are in the same or not
	int y =driver.findElement(By.name("pass")).getLocation().getX();
	System.out.println(y);
	int hight_y =driver.findElement(By.name("pass")).getSize().getHeight();
	System.out.println(hight_y);
	int y1 =driver.findElement(By.name("pass")).getSize().getWidth();
	System.out.println(y1);
	driver.findElement(By.name("email")).sendKeys("rohankotalwar");
	driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	
	//use of javascriptexecutp to scroll down the window
	JavascriptExecutor js = (JavascriptExecutor)driver ;
   
    for (int i=1;i <3;i++) {
    js.executeScript("window.scrollBy(0,50)");
    Thread.sleep(3000);
    
    }
	}

    
    @Test(priority=3)
    public void linktest(){
    	WebElement web1 =driver.findElement(By.xpath("//select[@name='birthday_day']"));
    	Select secu = new Select(web1);
   List<WebElement>yak =secu.getOptions(); //print all the elemnts in the dropdown
   int i =yak.size();
   System.out.println("number are:"+i);
   for (WebElement webu:yak) {
	 String a =  webu.getText();
	System.out.println(a);
   }
	//check wheather it is a multiple select listbox or  not
	boolean b=secu.isMultiple();
	System.out.println(b);
	Reporter.log("aftersuit",true);
    }
    @Test(priority=5)
    public void haucuscu() throws InterruptedException
    {
	
	WebElement webu1=driver.findElement(By.name("email"));
	
	for(int i=0;i<5;i++) {
		webu1.sendKeys("hiii"+i);
		Thread.sleep(3000);
		webu1.clear();
	}
    }
	 
	@Test(priority=6)
	public void robotclasss() throws AWTException, InterruptedException {
		
		for (int i=0 ; i<4 ;i++) {
		Robot r=new Robot();
	  	r.mouseMove(350, 500);
	  	r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  driver.get("http://www.facebook.com");
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(3000);
	
		}
		
	}	
	@Test(priority=7)
	public void abc() {
		Set<String> web = driver.getWindowHandles();
		
		int a =web.size();
		System.out.println("number of windows are :"+a);
	for(String windowhandle:web) {
		driver.switchTo().window(windowhandle);
		  driver.get("http://www.facebook.com");
		String b  =driver.getTitle();
		System.out.println("title of the page is :"+b);
		driver.close();
		}
	}
		@Test(priority=8)
		public  void colourcheck() throws InterruptedException{
			setup();
		driver.navigate().to("http://www.facebook.com");
		WebElement e = driver.findElement(By.xpath("//input[@value ='Log In']"));
		
		// get the colour 
		String colour_a=  e.getCssValue("color");
	System.out.println(colour_a);
	//list<Cookie> acc =driver.manage().getCookies();
	 // how to find wheather an element is multidropdown or not
	String[] abc = new String[4] ;
	abc[0] ="rohan";
	
	
}
    //int l=driver.findElements(By.tagName("a")).size();
    //System.out.println("number of links are"+l);
    
}  

   
   
  
    
    
   
    	
    

	

