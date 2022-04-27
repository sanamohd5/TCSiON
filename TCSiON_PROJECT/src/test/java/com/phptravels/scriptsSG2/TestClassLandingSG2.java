package com.phptravels.scriptsSG2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage2.LandingPageSG2;

public class TestClassLandingSG2 extends TestBase {
	LandingPageSG2 objLand;
	
	@Test(priority=6)   //Verifying valid username and invalid password by selecting Admin
	public void verifyHome() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickHome();
	    String expectedTitle1 =AutomationConstants.HOME_PAGE_TITLE;
	    String actualTitle1 = driver.getTitle();
	    Assert.assertEquals(expectedTitle1,actualTitle1);	 				    
	    }
	
	@Test(priority=7)   //Verifying valid username and invalid password by selecting Admin
	public void verifyHotels() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickHotels();
	    String expectedTitle2 =AutomationConstants.HOTELS_PAGE_TITLE;
	    String actualTitle2 = driver.getTitle();
	    Assert.assertEquals(expectedTitle2,actualTitle2);	 				    
	    }
	
	@Test(priority=8)   //Verifying valid username and invalid password by selecting Admin
	public void verifyFlights() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickFlights();
	    String expectedTitle3 =AutomationConstants.FLIGHTS_PAGE_TITLE;
	    String actualTitle3 = driver.getTitle();
	    Assert.assertEquals(expectedTitle3,actualTitle3);	 				    
	    }
	
	@Test(priority=9)   //Verifying valid username and invalid password by selecting Admin
	public void verifyTours() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickTours();
	    String expectedTitle4 =AutomationConstants.TOURS_PAGE_TITLE;
	    String actualTitle4 = driver.getTitle();
	    Assert.assertEquals(expectedTitle4,actualTitle4);	 				    
	    }
	
	@Test(priority=10)   //Verifying valid username and invalid password by selecting Admin
	public void verifyVisa() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickVisa();
	    String expectedTitle5 =AutomationConstants.VISA_PAGE_TITLE;
	    String actualTitle5 = driver.getTitle();
	//	String expectedTitle5 ="https://www.phptravels.net/visa";
	 //   String actualTitle5 = driver.getCurrentUrl();
	    Assert.assertEquals(expectedTitle5,actualTitle5);	 				    
	    }
	
	@Test(priority=11)   //Verifying valid username and invalid password by selecting Admin
	public void verifyBlogs() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickBlog();
	    String expectedTitle6 =AutomationConstants.BLOGS_PAGE_TITLE;
	    String actualTitle6 = driver.getTitle();
	    Assert.assertEquals(expectedTitle6,actualTitle6);	 				    
	    }
	
	@Test(priority=12)   //Verifying valid username and invalid password by selecting Admin
	public void verifyOffers() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.clickOffers();
	    String expectedTitle7 =AutomationConstants.OFFERS_PAGE_TITLE;
	    String actualTitle7 = driver.getTitle();
	    Assert.assertEquals(expectedTitle7,actualTitle7);	 				    
	    }
	
//	@Test(priority=13)   //Verifying valid username and invalid password by selecting Admin
//	public void verifyCurrencyUpdate() throws IOException {  
//		//Create Login Page object
//		objLand= new LandingPage(driver);
//		String currency = ExcelUtility2.getCellData(9, 1);
//		objLand.setCurrency();
//		
//}
	@Test(priority=13)   //Verifying valid username and invalid password by selecting Admin
	public void verifyCurrencyUpdate() throws IOException {  
		//Create Login Page object
		objLand= new LandingPageSG2(driver);
		objLand.setCurrency();
	}
}