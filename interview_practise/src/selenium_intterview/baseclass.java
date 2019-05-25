package selenium_intterview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class baseclass {
	
	public static WebDriver driver ;
	
	public void screeshot(String testname) {
		
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(F, new File("F:\\System workspace\\interview_practise\\screenshots"+testname+".jpg"));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
}
}
