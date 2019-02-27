package facebook;


	import java.io.File;
	import java.io.FileInputStream;
	
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Utility {
		
		public static WebDriver driver ;
		
		public static String propertyfile(String browser) throws IOException {
			FileInputStream file= new FileInputStream("F:\\System workspace\\com.qa.facebook\\src\\main\\java\\config\\configs.properties");
			Properties prop=new Properties();
			
			prop.load(file);
			
		String p=prop.getProperty(browser);
		System.out.println(p);
		return p;
			
		}
		
		public static WebDriver browser(String browsername) {
			
			if(browsername.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "S:\\selenium drivers\\chrome driver\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}
			
			else if (browsername.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "S:\\selenium drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				driver= new FirefoxDriver();
			}
			
			else {
				System.out.println("enter the browsername");
			}
			return driver ;
		}
		
		
		public void screeshot(String Methodname ) {
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(f, new File("F:\\System workspace\\com.qa.facebook\\Screenshots\\"+Methodname+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		}	
			


