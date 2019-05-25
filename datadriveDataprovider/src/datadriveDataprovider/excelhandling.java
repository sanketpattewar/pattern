package datadriveDataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelhandling {
	
	public static WebDriver driver ;
	

    @Test(dataProvider="facebook")
	public void testfacebook(String Username ,String password) {
   	 System.setProperty("webdriver.chrome.driver","S:\\selenium drivers\\chrome driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	driver.findElement(By.name("email")).sendKeys(Username);
   	driver.findElement(By.name("pass")).sendKeys(password);
   	driver.findElement(By.xpath("//input[@value='Log In']"));   	
   	System.out.println(driver.getTitle());
   	 
   	driver.close();
   	 
		
	}

		
	
	
	@DataProvider(name="facebook")
	public Object[][]readexcel() throws IOException{
		File file= new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		FileInputStream f= new FileInputStream(file);
		XSSFWorkbook w =new XSSFWorkbook(f);
		XSSFSheet S = w.getSheetAt(0);
		       int totalrows =    S.getLastRowNum();
		       int totalColums=S.getRow(0).getLastCellNum();
		       
		       Object obj[][]=new Object[totalrows][totalColums];
				for(int i=0;i<totalrows;i++) {
					for(int j=0 ;j<totalColums;j++){
						
					
				
					obj[i][j]=S.getRow(i).getCell(j).toString();
					obj[i][j]=S.getRow(i).getCell(j).toString();
				}
					
				}
				
				return obj;
	}
	    
		
	}
	
	
	
	


