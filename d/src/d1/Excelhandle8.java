package d1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelhandle8 {
WebDriver driver ;
	
	@DataProvider(name="abc")
	public Object[][] gettingdata() throws IOException {
		
		Object[][]data =Excelhandle7.testdata("sheet1");
		return data ;
	}
	
	@BeforeMethod()
		public void setup() {
		System.setProperty("webdriver.chrome.driver","S:\\selenium drivers\\chrome driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
		
	@Test(priority =1,dataProvider="abc")
	
	public void filltheform(String name,String surname)
	
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
		//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(number);
		//driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
		System.out.println("complete");
		
	}
	
	@Test(priority=2 )
	public void name(){
		System.out.println("starting nextmethod");
	}
		
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		System.out.println("next method will start");
		driver.close();
	}
	}

