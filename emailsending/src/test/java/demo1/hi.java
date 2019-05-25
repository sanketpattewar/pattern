package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hi {

	
public static void main(String[]args) throws IOException {
	File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
	FileInputStream file = new FileInputStream (f);
	XSSFWorkbook book = new XSSFWorkbook(file);
    XSSFSheet  sheet = book.getSheet("sheet1");	  
}
}