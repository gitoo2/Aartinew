package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class luxe 
{
    private WebDriver driver;
    private Actions act;
    private luxe luxe1;
    
    
    @FindBy (xpath="//a[text()='luxe']")
	private WebElement luxe;
    
    @FindBy (xpath="(//a[text()='Hair'])[1]")
	private WebElement hair;
    
    @FindBy (xpath="//span[text()='Discount']")
	private WebElement discount;
    
    @FindBy (xpath="//span[text()='50% and above']")
	private WebElement Disper;
    
    @FindBy (xpath="//span[text()='Add to Bag']")
	private WebElement addtobag;
  
  
    
    
	public luxe(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		}
	
	public void luxe() throws InterruptedException
	{
		act.moveToElement(luxe).perform();
		Thread.sleep(3000);
	}
	public void clickTohair() throws InterruptedException
	{
		//act.moveToElement(hair).moveToElement(discount).build().perform();
		hair.click();
		discount.click();
		Disper.click();
		
		
		Thread.sleep(3000);
		
		}
	public void mouseoverluxe1() throws InterruptedException
	{
		act.moveToElement(Disper).click();
		Thread.sleep(3000);
		
		}
	
	
	}
