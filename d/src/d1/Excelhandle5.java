 package d1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelhandle5 {
	
	
	public static WebDriver driver ;
	@Test(dataProvider="testdata")
	public void loginfacebook(String username ,String password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "S:\\selenium drivers\\chrome driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name='log']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
	     driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
	     System.out.println(driver.getTitle());
		
         Thread.sleep(3000);
        
         driver.close();
         
		
	}
	
	@DataProvider (name="testdata")
	public Object[][] dataoffacebook() throws IOException {
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		FileInputStream file =new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet =book.getSheet("sheet1");
		int Rowcount =sheet.getLastRowNum();
		int colomncount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(Rowcount);
		System.out.println(colomncount);
		Object[][] data = new Object[Rowcount+1][colomncount];
		
		for(int i=0; i<=Rowcount;i++) {
			for(int j=0;j<colomncount;j++) {
				
				data[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			
				
				}
		}
		return data;
		
		
		
	}
	
	
}
