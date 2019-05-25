package abctest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ADF {

	public static void main(String[] args) throws Exception {
		
     System.out.println("hello");
     File  f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
     FileInputStream file= new FileInputStream(f);
     XSSFWorkbook book = new XSSFWorkbook(file);
     XSSFSheet sheet = book.getSheet("Sheet1"); 
       int Row = sheet.getLastRowNum();
       System.out.println(Row);
       int colomn=sheet.getRow(0).getLastCellNum();
       System.out.println(colomn);
       
       Object[][] data = new Object[Row+1][colomn];
       
       for(int i=5;i<=Row;--i) {
    	   for(int j=0 ;j<colomn ;j++) {
    		   
    		   
    		
    		   data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
    		   System.out.println(data[i][j]);
    	   }
       }
       
	
       }
       
	

}
