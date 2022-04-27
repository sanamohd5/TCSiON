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
//	@FindBy(css="a.theme-btn:nth-child(6)")
	@FindBy(xpath="//header/div[1]//div[2]//a[2]")
    private WebElement Login;    
  //  @FindBy(css="input[placeholder='Email']")
	@FindBy(xpath="//input[@placeholder='Email']")
    private WebElement email;    
  //  @FindBy(css="input[placeholder='Password']")
	@FindBy(xpath="//input[@placeholder='Password']")
    private WebElement password;     
    @FindBy(xpath="//body/div//div[3]/button")
 //   @FindBy(css=".btn-lg")
    private WebElement LoginButton;
    @FindBy(xpath="//div[@class='message']")
    private WebElement errormsg;
    
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
    public void clickLogin() {
    	Login.click();
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
    //	return new MyBookingsPageSG1(driver);
    	}  	
  
  	   }



