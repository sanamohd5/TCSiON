package com.phptravelspages.stage4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardSG4 {
	
//	All WebElements are identified by @FindBy annotation
	
	WebDriver driver;
	@FindBy(xpath="//div/a[3]")
	private WebElement dashboardBtn;
	@FindBy(xpath="//div[@class='text-muted']")
	private WebElement salesoverviewtext;	
	@FindBy(xpath="//main/div/div[3]/div[1]")
	private WebElement revenuebreakdown;
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
        PageFactory.initElements(driver, this);  //This initElements method will create all WebElements
        }    
	public void ClickDashboardBtn() {
		dashboardBtn.click();
		}
	public String SetSalesOverviewText() {
		return salesoverviewtext.getText();
	}
	public boolean SetRevenueBreakChart() {
		return revenuebreakdown.isDisplayed();	
	}   
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


