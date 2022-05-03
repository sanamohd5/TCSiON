package com.phptravelspages.stage3;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSG3 {
	
	WebDriver driver;
	@FindBy(xpath="//div[4]/div//div[2]//a/small")
	private WebElement adminback; 
	@FindBy(xpath="//input[@type='text']")
    private WebElement email;    
	@FindBy(xpath="//input[@type='password']")
    private WebElement password;     
    @FindBy(xpath="//div[4]/button/span[1]")
    private WebElement LoginButton;

    
    public LoginPageSG3(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); 
        }        
    public void clickAdminBack() {
    	adminback.click();
    	}
    public void redirectAdminPage() {
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

    public BookingsPageSG3 clickLoginButton() {
    	 WebDriverWait wait=new WebDriverWait(driver,10);	  
    	 wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
    	LoginButton.click();
		return new BookingsPageSG3(driver);
    	} 
 
}
