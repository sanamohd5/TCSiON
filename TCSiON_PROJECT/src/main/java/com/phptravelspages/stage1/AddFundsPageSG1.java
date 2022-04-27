package com.phptravelspages.stage1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFundsPageSG1 {
	
	
		WebDriver driver;
		@FindBy(css="li.user_wallet > a:nth-child(1)")
	    private WebElement addfunds;
		@FindBy(xpath="//input[@name='price']")
	    private WebElement price; 
		@FindBy(xpath="//img[@alt='paypal']")
		private WebElement paypal;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement paynow; 
		@FindBy(xpath="//div[@class='btn-front']")
		private WebElement backtoinvoice; 
		@FindBy(xpath="//a[@class='yes']")
		private WebElement yes;
		
		public AddFundsPageSG1(WebDriver driver) {    
	    	this.driver = driver;    
	        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
	        }        
	    public void clickAddFunds() {
	    	addfunds.click();
	    	}
	    public void clearAddPrice() {
	    	price.clear();
	    	}
	    public void AddPrice() {
	    	price.sendKeys("50");
	    	}
	    public void clickPayPal() {
	    	paypal.click();
	    	}
	    public void clickPayNow() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("arguments[0].scrollIntoView();", paynow);
	    	paynow.click();
	    	//return new MyProfilePage(driver);
	    	}
	    public void clickBacktoInvoice() {
	    	backtoinvoice.click();
	    	}
	    public void clickYes() {
	    	yes.click();
	    }
}
