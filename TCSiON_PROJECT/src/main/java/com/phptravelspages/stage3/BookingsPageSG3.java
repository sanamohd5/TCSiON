package com.phptravelspages.stage3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingsPageSG3 {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-link loadeffect']")
	private WebElement bookings;
	@FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[14]/a")
	private WebElement invoice;
	@FindBy(xpath="//div[2]/div//div[2]//tr[1]/td[11]/select")
	private WebElement pending;
	@FindBy(xpath="//div[2]//div[2]/div//tr[1]/td[11]/select")
	private WebElement confirmed;
	@FindBy(xpath="//div[2]//div[2]/div//tr[1]/td[11]/select")
	private WebElement cancelled;
	@FindBy(xpath="//nav/div/div/ul/li[1]/a")
	private WebElement website;
	@FindBy(xpath="//tr/td[15]/button")
	private WebElement delete;	
	@FindBy(xpath="//div[1]/div[4]/a/div/div/div/div[1]/div[1]")
	private WebElement paidbookcount;
	@FindBy(xpath="//div[1]/div[4]/a/div/div/div")
	private WebElement paidbook;
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[3]/a/div/div/div/div[1]/div[1]")
    private WebElement cancelledbookcount;
	@FindBy(xpath="//div[1]/div[3]/a/div/div/div")
	private WebElement cancelledbook;
	@FindBy(xpath="//div[1]/div[2]/a/div/div/div/div[1]/div[1]")
    private WebElement pendingbookcount;
	@FindBy(xpath="//div[1]/div[2]/a/div/div/div")
	private WebElement pendingbook;	
	@FindBy(xpath="//div[1]/div[1]/a/div/div/div/div[1]/div[1]")
    private WebElement confirmedbookcount;
	@FindBy(xpath="//div[1]/div[1]/a/div/div/div")
    private WebElement confirmedbook;
	@FindBy(xpath="//div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[12]/select")
	private WebElement unpaid;
		
	public BookingsPageSG3(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); 
        }        
    public void clickBookings() {
    	bookings.click();
    	}
    
    public void clickInvoice() {
    	invoice.click();
    	}
    public void clickDelete() {
    	delete.click();   	
    	}
    	
    public void confirmBookingInvoice() {
    	String parent=driver.getWindowHandle();
    	Set<String>s=driver.getWindowHandles();
    	Iterator<String> I1= s.iterator();

    	while(I1.hasNext())
    	{

    	String child_window=I1.next();
    	
    	if(!parent.equals(child_window))
    	{
    	driver.switchTo().window(child_window);
    	
    	System.out.println(driver.switchTo().window(child_window).getTitle());    	

    	driver.close();
       	
    	}

    	}
    	driver.switchTo().window(parent);

}
    


    public void setBookingStatusPC(String strBookingStatus)   {    
    	Select drop=new Select(pending);
    	 drop.selectByVisibleText(strBookingStatus);
  	   
 	   }
    public void setBookingStatusCC()   {    
//    	confirmed.click();
//    	cancelled.sendKeys(Keys.RETURN);
    	Select drop=new Select(confirmed);
    	drop.selectByVisibleText("Cancelled");
  	  // drop.selectByVisibleText(strBookingStatus);
  	   
 	   }
    
    public void setBookingStatusCPaid()   {    
    	Select drop=new Select(unpaid);
    	drop.selectByVisibleText("Paid");
  	   
 	   }
    
	public String setPaidBookCount() {
		return paidbookcount.getText();
	}
	public void clickPaidBook() {
		paidbook.click();
	}
		
	public String setCancelledBookCount() {
		return cancelledbookcount.getText();
	}
	public void clickCancelledBook() {
		cancelledbook.click();
	}
		
	public String setPendingBookCount() {
		return pendingbookcount.getText();
	}
	public void clickPendingBook() {
		pendingbook.click();
	}
	public void clickPending() {
		pending.click();
	}
		
	public String setConfirmBookCount() {
		return confirmedbookcount.getText();
	}
	public void clickConfirmBook() {
		confirmedbook.click();
	}
	public void clickConfirm() {
		confirmed.click();
	}

	 public void viewWebsite() throws InterruptedException { 
		// WebDriverWait wait=new WebDriverWait(driver,10);	  
    	// wait.until(ExpectedConditions.elementToBeClickable(website));
		 website.click();		 	
		 WebDriverWait wait=new WebDriverWait(driver,10);	  
	     wait.until(ExpectedConditions.visibilityOf(website));
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());		
		 driver.switchTo().window(tabs.get(1));
					   	 
	    }
	    
    }
