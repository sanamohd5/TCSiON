package com.phptravels.scriptsSG2;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage2.LandingPageSG2;

public class TestClassLandingSG2 extends TestBase {
	LandingPageSG2 objLand;
	
	@Test(priority=6)  //Verifying Home Button
	public void verifyHome() throws IOException {  
		//Create Landing Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickHome();
	    String expectedTitle =AutomationConstants.HOME_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Home Page Title : " +actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=7)   //Verifying Hotel Search by entering data 
	public void verifyHotelSearch() throws IOException, InterruptedException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickHotels();
	    String expectedTitle =AutomationConstants.HOTELS_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Hotels Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 
	    objLand.clickSearch();
	    objLand.SetSearchByInput();
	    Thread.sleep(2000);
	    objLand.clickFromDropdown();
	    Thread.sleep(2000);
	    objLand.clickSearchButton();
	    Thread.sleep(2000);
	    String expectedTitle2 =AutomationConstants.HOTELS_SEARCH_TITLE;
	    String actualTitle2 = driver.getTitle();
	    System.out.println("Hotels Search Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle2,actualTitle2);	
	    }
	
	@Test(priority=8)   //Verifying Flights Button
	public void verifyFlights() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickFlights();
	    String expectedTitle =AutomationConstants.FLIGHTS_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Flights Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=9)   //Verifying Tours Button
	public void verifyTours() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickTours();
	    String expectedTitle =AutomationConstants.TOURS_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Tours Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=10)   //Verifying Visa Button
	public void verifyVisa() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickVisa();
	    String expectedTitle =AutomationConstants.VISA_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Visa Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=11)   //Verifying Blog Button
	public void verifyBlogs() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickBlog();
	    String expectedTitle =AutomationConstants.BLOGS_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Blogs Page Title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=12)   //Verifying Offers Button
	public void verifyOffers() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.clickOffers();
	    String expectedTitle =AutomationConstants.OFFERS_PAGE_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println("Offers page title : " + actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);	 				    
	    }
	
	@Test(priority=13)   //Update USD to INR
	public void verifyCurrencyUpdate() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.setCurrency();
	}
	
	@Test(priority=14)  //Verifying links functionalities
	public void verifylinks() throws IOException {  
		objLand= new LandingPageSG2(driver);
		objLand.setAccount();
		objLand.clickMyBookings();
		objLand.clickAddFunds();
		objLand.clickMyProfile();
		objLand.clickLogout();
	}
	
}