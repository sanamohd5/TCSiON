package com.phptravelspages.stage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBookingsPageSG1 {
		WebDriver driver;
		@FindBy(xpath="//div[1]/div/div[3]/ul/li[2]/a")
	    private WebElement mybookings;
		@FindBy(xpath="//div/div[2]//table//tr[1]//td[4]//a")
	    private WebElement viewvoucher;
//		@FindBy(css="div.col-md-6:nth-child(1) > ul")
//		private WebElement VoucherConfirm;
		
		public MyBookingsPageSG1(WebDriver driver) {    
	    	this.driver = driver;    
	        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
	        }        
	    public void clickMyBookings() {
	    	mybookings.click();
	    	}
	    public void DisplayVoucher() {
	    	viewvoucher.click();
	    	}
//	    public AddFundsPage setVouchrConfirm() {
//	   	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	   	 driver.switchTo().window(tabs.get(1));
//	   	 String Customer=VoucherConfirm.getText();
//	   	 System.out.println(Customer);
//	   	 boolean c=Customer.contains("user@phptravels.com");
//	   	 System.out.println("Customer details correct:" + c);
//	   	 return new AddFundsPage(driver);
//	    }
	//    public AddFundsPage setVoucherConfirm() {
	    public void setVoucherConfirm() {
	    	String parent=driver.getWindowHandle();
	    	Set<String>s=driver.getWindowHandles();
	    	Iterator<String> I1= s.iterator();

	    	while(I1.hasNext())
	    	{

	    	String child_window=I1.next();


	    	if(!parent.equals(child_window))
	    	{
	    	driver.switchTo().window(child_window);

	    	System.out.println(driver.switchTo().window(child_window).getTitle());

	    	driver.close();
	    	}

	    	}
	    	driver.switchTo().window(parent);

	    // return new AddFundsPage(driver);
		    }
}
