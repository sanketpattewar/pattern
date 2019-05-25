package d1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandle2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
			FileInputStream file = new FileInputStream (f);
			XSSFWorkbook book = new XSSFWorkbook(file);
		    XSSFSheet  sheet = book.getSheet("Sheet1");	   
		    int RowCount =sheet.getLastRowNum();
		    System.out.println("total number of rows in a sheet :"+RowCount);
		        
		    int Colomncount=sheet.getRow(0).getLastCellNum();       
		        System.out.println("total number of columns in a sheet :"+Colomncount);
		     
		        
		    for(int i=0 ;i<RowCount ;i++) {
		        	
		    	for(int j=0 ;j<Colomncount;j++) {
		        	
System.out.println("Element at "+i+" row,"+j+"th"+" coloumn is "+":"+sheet.getRow(i).getCell(j).getStringCellValue());
		        	
		        		
		        	}
		        }
		        
		        
		        

	}

}
