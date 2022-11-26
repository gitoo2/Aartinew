package TestNgClass;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Brands;
import pages.luxe;
import setup.Base;

public class NykkatestNg2 extends Base
{
    private WebDriver driver;
    private Brands brandsobj;
    private luxe luxe1;
    private Actions act;
    
	@BeforeTest
	public void launchbrowsers(String browserName )
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			driver=openchromebrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver=openFirefoxbrowser();
		}
//	  
	}
	@BeforeClass
	public void createpomobjects()
	{
		brandsobj=new Brands(driver);
		luxe1=new luxe(driver);
	}
	
	
	@BeforeMethod
	public void launchApplication()
	{
		  driver.get("https://www.Nykaa.com");

	}
	
	@Test(enabled=false)
	public void brandstest() throws InterruptedException
	{
		    
			brandsobj.movetobrands();
			//brandsobj.scrollpage();
			ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(addr.get(1));
			brandsobj.nykaatv();
			
			addr=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(addr.get(0));
			
	}
	
	@Test
	public void luxe() throws InterruptedException
	{
		   
		   luxe1.luxe();
		   
		   
	}
	
	@Test
	public void mouseoverluxe() throws InterruptedException
	{
		luxe1.clickTohair();
		luxe1.mouseoverluxe1();
	}
	
	
	@AfterClass
	
		public void destuctor()
		{
			brandsobj=null;
			luxe1=null;
			
		}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
		
	}
	
		
	}
	

	
	

