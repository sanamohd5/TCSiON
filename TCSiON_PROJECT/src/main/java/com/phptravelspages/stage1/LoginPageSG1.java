package com.phptravelspages.stage1;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPageSG1 {
	WebDriver driver;
	
	@FindBy(xpath="//div[2]/div[1]//div[2]//a/small")
	private WebElement customerfront;      
	@FindBy(xpath="//input[@placeholder='Email']")
    private WebElement email;    
	@FindBy(xpath="//input[@placeholder='Password']")
    private WebElement password;     
    @FindBy(xpath="//body/div//div[3]/button")
    private WebElement LoginButton;
    @FindBy(id="cookie_stop")
    private WebElement cookie;
    
    public LoginPageSG1(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
        }    
    public void clickCustomerFront() {
    	customerfront.click();
    	}
    public void redirectCustomerPage() {
	   	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	   	 driver.switchTo().window(tabs.get(1));
	    }
    public void clickCookie() {
    	cookie.click();
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
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();",LoginButton );
    	WebDriverWait wait=new WebDriverWait(driver,10);	  
    	wait.until(ExpectedConditions.elementToBeClickable(LoginButton));    	
    	LoginButton.click();
    	}  	
  
  	   }



