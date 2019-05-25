package d1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class d2 {

	public static void main(String[] args) throws IOException  {
		
		
  // 1 . simple program for read data from excel .
		
		/*
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet("sheet1");
		String data00=sheet.getRow(0).getCell(1).getStringCellValue(); // it returns value a 0th row and oth cell that coloumn
		System.out.println(data00);
		
		*/
		
		
 // 2. i used logic here and its working .
		/*
        File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet("sheet1");
		
         for (int i=0 ; i<4 ; i++)
		 {
			for (int j=0 ;j<2;j++)
			
			{
			
			String data00=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data00);
			
				}
			}*/
		
		
//3 .actual logic we have to implement
	
	File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
	
    FileInputStream filee = new FileInputStream(f);
    
    XSSFWorkbook wb1 = new XSSFWorkbook(filee);
    
      XSSFSheet sheett = wb1.getSheet("sheet1"); // it uses sheet1 
      
      int rownumber=sheett.getLastRowNum(); // it used to count total number of rows in sheet
      
      System.out.println("total number of row in sheet is:"+rownumber);
      
      XSSFRow row = sheett.getRow(0);
      
      int columnnumber  =row.getLastCellNum();
      
      System.out.println("total number of columns are :"+columnnumber);
      
      
       for ( int i =0 ; i< rownumber ; i++) 
    	   
    	  for (int j=0 ; j<columnnumber;j++)
      {
    	  
    	 String value= sheett.getRow(i).getCell(j).getStringCellValue();
    			   System.out.println(value);
      
      
                   
      }
    

	
	}
}
