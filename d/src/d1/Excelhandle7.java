package d1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excelhandle7 {

	
	public static Object[][] testdata(String sheetname) throws IOException {
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		FileInputStream file = new FileInputStream(f);
		
		XSSFWorkbook b = new XSSFWorkbook(file);
		
	    XSSFSheet sheet=b.getSheet(sheetname);
	    
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
