package mavenpractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class xlsxfilehandling {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		
		FileInputStream file = new FileInputStream(f);

		XSSFWorkBook book = new XSSfWorkbook(file);
		
	}

}
