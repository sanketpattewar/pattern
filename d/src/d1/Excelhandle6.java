package d1;




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelhandle6 {
	
	
	WebDriver driver ;
	
	
	
	@Test(dataProvider="Facebook")
	public void faceookloginpage(String Username,String password) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","S:\\selenium drivers\\chrome driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys(Username);
	driver.findElement(By.name("pass")).sendKeys(password);
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
//	driver.quit();
		}
	
	@DataProvider(name="Facebook")
	public static Object[][] testdata() throws IOException {
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		FileInputStream file = new FileInputStream(f);
		
		XSSFWorkbook b = new XSSFWorkbook(file);
		
	    XSSFSheet sheet=b.getSheet("sheet1");
	    
	    int rows =sheet.getLastRowNum(); 
	    System.out.println("number of rows in sheet is:"+rows); 
	         
	    int colomns =sheet.getRow(0).getLastCellNum();
		System.out.println("number of colomns in sheet is:"+colomns);
		
		Object[][]data= new Object[rows+1][colomns];
		
        for(int i=0 ; i<=rows ; i++) {
			
			for (int j =0 ;j<colomns ; j++){
				
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return data ;

	}
	
	}
	


