package com.phptravelspages.stage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPageSG2 {
	
//	All WebElements are identified by @FindBy annotation
	
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
	@FindBy(xpath="//div[1]/div[2]//div[3]//button")
	private WebElement account;
	@FindBy(xpath="//div[2]//div[3]//ul/li[2]/a")
	private WebElement ddmybookings;
	@FindBy(xpath="//div[1]/div/div[3]/ul/li[2]/a")
    private WebElement mybookings;
	@FindBy(css="li.user_wallet > a:nth-child(1)")
    private WebElement addfunds;
	@FindBy(xpath="//div[3]/ul/li[4]/a")
    private WebElement myprofile;
	@FindBy(xpath="//div[1]/div[3]/ul/li[5]/a")
	private WebElement logout;
	@FindBy(xpath="//*[@id=\"select2-hotels_city-container\"]")
	private WebElement search;
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchbyinput;
	@FindBy(xpath="//*[@id=\"select2-hotels_city-results\"]/li")
	private WebElement selectfromdrop;	
	@FindBy(xpath="//*[@id=\"submit\"]/span[1]")
	private WebElement searchbutton;
	
    public LandingPageSG2(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
        }        
    public void clickHome() {
    	WebDriverWait wait=new WebDriverWait(driver,5);	  
    	wait.until(ExpectedConditions.elementToBeClickable(home)); 
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

    public void setCurrency()  {    
    	currency.click();
         inr.click();
         }

    public void setAccount() {
    	account.click();
    	ddmybookings.click();
    	}
    public void clickMyBookings() {
    	mybookings.click();
    	}
   
    public void clickAddFunds() {
    	addfunds.click();
    	}
    public void clickMyProfile() {
    	myprofile.click();
    	}    
    public void clickLogout() {
    	logout.click();
    	}
    public void clickSearch() {    	
    	search.click(); 
    	}
    public void SetSearchByInput() {
    searchbyinput.sendKeys("dubai");
    }
    public void clickFromDropdown() {   	 
    	selectfromdrop.click();
    	}
    public void clickSearchButton() {
    	searchbutton.click();
    	
   	}
    
}
