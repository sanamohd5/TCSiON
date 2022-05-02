package com.phptravelspages.stage4;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageSG4 {
	
	WebDriver driver;
	@FindBy(xpath="//div[5]//div[1]/a/small")
	private WebElement supplierback;   
	@FindBy(xpath="//input[@type='text']")
    private WebElement email;    
	@FindBy(xpath="//input[@type='password']")
    private WebElement password;     
    @FindBy(xpath="//div[4]/button/span[1]")
    private WebElement LoginButton;

    
    public LoginPageSG4(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); 
        }        
    public void clickSupplierBack() {
    	supplierback.click();
    	}
    public void redirectSupplierPage() {
	   	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	   	 driver.switchTo().window(tabs.get(1));
	    }
    public void setEmail(String strEmail){
 	   email.sendKeys(strEmail);          

 	   }   
    public void setPassword(String strPassword){
 	   password.sendKeys(strPassword);
 	   }            
    
    public void clearEmail() {
 	   email.clear();
 	   }
    public void clearPassword() {
 	   password.clear();                
 	   }

    public void clickLoginButton() {
    	 WebDriverWait wait=new WebDriverWait(driver,10);	  
    	 wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
    	LoginButton.click();
	
    	} 


}
