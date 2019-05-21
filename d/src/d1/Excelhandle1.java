package d1;

import java.io.FileNotFoundException;

public class Excelhandle1 {

	
	
	
	public  static void main(String[]args)  {
		
		Excelhandle e = new Excelhandle("C:\\Users\\Rohan\\Desktop\\rohan1.xlsx");
		
		String x =e.getdata("sheet1",0,0);
		System.out.println(x);
		
		
	}
	
		
		
		

	

}
