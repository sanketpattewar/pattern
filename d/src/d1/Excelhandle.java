package d1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandle {
	
	
	XSSFWorkbook book;
	XSSFSheet sheet;
	
	
	public Excelhandle(String filepath)  {
		try {
			
		File f2 = new File (filepath);
		FileInputStream file6 = new FileInputStream(f2);
		
			
			book = new XSSFWorkbook(file6);
			
		   } catch (Exception e) {
			
		System.out.println(e.getMessage());
		
		}
		
		
		
	}
		public String getdata(String sheetname ,int rownumber,int cellnumber ) {
			
		 sheet=	book.getSheet(sheetname);
			
		 String value =sheet.getRow(rownumber).getCell(cellnumber).getStringCellValue();
		 
		 return value ;
		}
		 	
		
	}

	 
	 
	 
 

