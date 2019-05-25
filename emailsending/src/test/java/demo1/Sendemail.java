package demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendemail {

	public static void main(String[]args) throws EmailException {
		
		System.out.println("=====Test Started======");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rohankotalwar7@gmail.com", "sangmeshwar1234"));
		email.setSSLOnConnect(true);
		email.setFrom("rohankotalwar7@gmail.com");
		email.setSubject("TestEMailsending");
		email.setMsg("mag bhava alay ka message");
		email.addTo("sanketpattewar12@gmail.com");
		email.send();
	
		System.out.println("==========Email sent===============");
	}	
	
	
}
