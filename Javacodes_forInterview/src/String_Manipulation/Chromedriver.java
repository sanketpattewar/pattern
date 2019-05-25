package String_Manipulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/");
	}

}
