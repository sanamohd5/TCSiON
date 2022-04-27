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
	@FindBy(xpath="//tr/td[14]/a")
	private WebElement invoice;
	@FindBy(xpath="//select[@class='form-select status pending']")
	private WebElement pending;
//	@FindBy(xpath="//select[@class='form-select status confirmed']")
//	private WebElement confirmed;
	@FindBy(xpath="//nav/div/div/ul/li[1]/a")
	private WebElement website;
		
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
    public void setBookingStatus(String strBookingStatus)   {    
    	Select drop=new Select(pending);
  	   drop.selectByVisibleText(strBookingStatus);
  	   
 	   }

    public void viewWebsite() {    	
    	website.click();
    }
    public void viewWebsite2() {
	   	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	   	 driver.switchTo().window(tabs.get(1));
	   	 String Customer=driver.getTitle();
	  	 System.out.println(Customer);

	    }
    
    }
