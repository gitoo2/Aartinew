package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
   public WebDriver openchromebrowser()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\padva\\OneDrive\\Documents\\ChromeDriver new path\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
   }
   
   public WebDriver openFirefoxbrowser()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\padva\\OneDrive\\Documents\\ChromeDriver new path\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
   }
   
}
