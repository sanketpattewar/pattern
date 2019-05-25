package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelhandle4 {
	
	@Test(dataProvider="testdata")
	
	public void test(String username ,String password) {
		System.setProperty("webdriver.chrome.driver", "S:\\selenium drivers\\chrome driver\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
     driver.get("http://demosite.center/wordpress/wp-login.php");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@name='log']")).sendKeys(username);
     driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
     driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
     
     System.out.println(driver.getTitle());
     driver.quit();
     }

	@DataProvider(name="testdata")
	 public Object[][] passdata(){
		
		Object[][] data = new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0] ="admin2";
		data[2][1] ="demo1234";
		
		
		return data ;
	}
}
