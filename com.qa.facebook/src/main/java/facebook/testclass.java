package facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(LIStner.class)

public class testclass extends Utility{
	
	//Logger log =Logger.getLogger(testclass.class);
	Logger log = Logger.getLogger(testclass.class);
	@BeforeMethod
	public void Setup() throws IOException {
		
		Utility.browser(Utility.propertyfile("browsername"));
		log.info("facebook launching");
		log.debug("laumnching");
		log.fatal("it is a fatal message");
		log.warn("it is a warning message");
	}
		@Test
		public void smoketest() throws IOException {
			
			System.out.println("welcome to smoke test");
			driver.get(Utility.propertyfile("url"));
			log.fatal("it is a fatal message");
			log.warn("it is a warning message");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

			
			
		}
		@Test
		public void failtest() {
			Assert.assertEquals(true, true);
		}
		
		
		
		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
		
	}
	
	
	


