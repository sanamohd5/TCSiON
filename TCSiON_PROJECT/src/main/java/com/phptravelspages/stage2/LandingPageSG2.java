package com.phptravelspages.stage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageSG2 {
	WebDriver driver;

	@FindBy(xpath="//nav/ul/li[1]/a")
    private WebElement home;
	@FindBy(xpath="//nav/ul/li[2]/a")
    private WebElement hotels;
	@FindBy(xpath="//nav/ul/li[3]/a")
    private WebElement flights;	
	@FindBy(xpath="//nav/ul/li[4]/a")
    private WebElement tours;
	@FindBy(xpath="//nav/ul/li[5]/a")
    private WebElement visa;
	@FindBy(xpath="//nav/ul/li[6]/a")
    private WebElement blog;
	@FindBy(xpath="//nav/ul/li[7]/a")
    private WebElement offers;
	@FindBy(id="currency")
	private WebElement currency;
	@FindBy(css="ul.show > li:nth-child(7) > a")
    private WebElement inr;
	
	
    
    public LandingPageSG2(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); 
        }        
    public void clickHome() {
    	home.click();
    	}
    public void clickHotels() {
    	hotels.click();
    	}
    public void clickFlights() {
    	flights.click();
    	}
    public void clickTours() {
    	tours.click();
    	}
    public void clickVisa() {
    	visa.click();
    	}
    public void clickBlog() {
    	blog.click();
    	}
    public void clickOffers() {
    	offers.click();
    	}
//    public void setCurrency(String strCurrency)   {    
//    	Select drop=new Select(currency);
//  	   drop.selectByVisibleText(strCurrency);
// 	   }
    public void setCurrency()   {    
    	currency.click();
         inr.click();
 	   }

}
