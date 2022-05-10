package com.phptravelspages.stage1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyProfilePageSG1 {
	
//	All WebElements are identified by @FindBy annotation
	
	WebDriver driver;
	@FindBy(xpath="//div[3]/ul/li[4]/a")
    private WebElement myprofile;
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	@FindBy(xpath="//input[@name='zip']")
	private WebElement postalcode;
	@FindBy(xpath="//input[@name='address1']")
	private WebElement address;
	@FindBy(xpath="//input[@name='address2']")
	private WebElement address2;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement updateprofile;
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement updatesuccess;
	@FindBy(xpath="//div[1]/div[3]/ul/li[5]/a")
	private WebElement logout;
	
	
	public MyProfilePageSG1(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
        }        
    public void clickMyProfile() {
    	myprofile.click();
    	}
   
    public void setState(String strState) {
    	WebDriverWait wait=new WebDriverWait(driver,10);	  
    	wait.until(ExpectedConditions.elementToBeClickable(state));
    	state.sendKeys(strState);     	
  	   }
    public void setCity(String strCity) {
    	city.sendKeys(strCity);     	
  	   }     
    public void setPostalCode(String strPostalCode) {
    	postalcode.sendKeys(strPostalCode);     	
  	   }
    public void setAddress(String strAddress) {
    	address.sendKeys(strAddress);     	
  	   }
    public void setAddress2(String strAddress2) {
    	address2.sendKeys(strAddress2);     	
  	   }
    public void clickUpdateProfile() {
    	updateprofile.sendKeys(Keys.RETURN);
    	}
    public void clickLogout() {
    	logout.click();
    	}
    public void clearPostalCode() {
    	postalcode.clear();
    	}
    public void clearAddress() {
    	address.clear();
    	}
    public void clearAddress2() {
    	address2.clear();
    	}
    public void clearState() {
    	state.clear();
    	}
    public void clearCity() {
    	city.clear();
    	}

	

}
