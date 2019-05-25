package practisesession.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
				
		FileInputStream file = new FileInputStream(f);
		XSSFworkBook book = new XSSfWorkBook(file);
	
 
	}

}
