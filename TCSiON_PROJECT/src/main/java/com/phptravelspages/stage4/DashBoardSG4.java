package com.phptravelspages.stage4;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashBoardSG4 {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='text-muted']")
	private WebElement text;	
	@FindBy(xpath="//div[1]/a[5]")
	private WebElement tours;
	@FindBy(xpath="//div[8]/nav/a")
	private WebElement subtours;
	@FindBy(xpath="//div[8]/nav/div[1]//a[1]")
	private WebElement managetours;
	@FindBy(xpath="//div[8]/nav/div[1]//a[2]")
	private WebElement extras;
	
	@FindBy(xpath="//div[1]/a[6]")
	private WebElement bookings;
	
	public DashBoardSG4(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); 
        }        

    public void testtext() {
    	   	     
        String t = text.getText();
        // getPageSource() to get page source
     //   System.out.println(driver.getTitle());
        if ( driver.getPageSource().contains("Sales overview & summary")){
        	WebDriverWait wait=new WebDriverWait(driver,5);	  
          	wait.until(ExpectedConditions.visibilityOf(text));
           System.out.println("Text: " + t + " is present. ");
        //   System.out.println(driver.getTitle());
        } else {
           System.out.println("Text: " + t + " is not present. ");
        }
     }
//	public void testtext() {
//			
//		String a=text.getText();
//		String e="Sales overview & summary";
//		Assert.assertEquals(a,e);
//	//Assert.assertTrue("Text not found!", text.contains(Sales overview & summary));
//	}
    
    public void clickTours() {
    tours.click();
    	}
    public void clickSubTours() {
           subtours.click();
    }
    public void clickManageTours() {
        managetours.click();
 }
    public void clickExtras() {
        extras.click();
        	}
    public void clickBookings() {
       bookings.click();
        	}
}


