package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brands {
	
	private WebDriver driver;
	private Actions act;
	private JavascriptExecutor js;
    private Brands brandsobj;

	
	
	@FindBy (xpath="//a[text()='brands']")
	private WebElement brands;
	
	@FindBy (xpath="(//a[text()='Huda Beauty'])[1]")
	private WebElement HudaBeauty;
	
	
	@FindBy (xpath="//a[text()='Nykaa TV']")
	private WebElement nykatv;
	
	@FindBy (xpath="//input[@placeholder='Search Videos']")
	private WebElement searchvideo;
	

	public Brands(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}

	public void movetobrands() throws InterruptedException
	{
		act=new Actions(driver);
		//act.moveToElement(brands).click().build().perform();
		act.moveToElement(brands).moveToElement(HudaBeauty).build().perform();
		Thread.sleep(3000);
		
		act.moveToElement(nykatv).click().build().perform();

		
	}

	
	public void nykaatv() throws InterruptedException
	{

		
		searchvideo.sendKeys("Aarti");
	}
	
		
	
	
	
	
	
}
