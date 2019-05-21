package javascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpAndDown {
	public static WebDriver driver ;
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\selenium drivers\\chrome driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
	Actions act= new Actions(driver);
	
	
	String parentwindowhandle= driver.getWindowHandle();
	System.out.println(parentwindowhandle);
	
	int a=driver.getWindowHandles().size();
	 driver.findElement(By.name("email")).sendKeys("rohankotalwar@gmail.com");
	 driver.findElement(By.name("pass")).sendKeys("sangmeshwar123");
	 driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
	 
	 
	System.out.println("number of windows opened on the system is:"+a);
File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("F:\\System workspace\\com.qa.facebook\\Screenshots"+".jpg"));
		
	}

}
