package com.phptravels.scriptsSG4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage4.DashBoardSG4;

public class TestClassDashboardSG4 extends TestBase {
	
	DashBoardSG4 objDashbrd;
	
	@Test(priority=6)  //Verifying the text is present
	public void verifyDashboard() throws IOException {  
		//Create DashBoard Page object	   
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.ClickDashboardBtn();
		String overview=objDashbrd.SetSalesOverviewText();
		System.out.println("Text present : " + overview);
	}
	@Test(priority=7)  //Displaying Revenue BreakDown
	public void DisplayRevenueBreak() throws IOException {     
		objDashbrd = new DashBoardSG4(driver);
		boolean Revenuechart=objDashbrd.SetRevenueBreakChart();
		System.out.println("Displaying Revenue BreakDown : " +  Revenuechart);
		Assert.assertEquals(Revenuechart, true);
		}
	
	@Test(priority=8)   //Verifying Tours Link is redirected
	public void verifyTours() throws IOException {  
	  
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.clickTours();
		objDashbrd.clickSubTours();
		objDashbrd.clickManageTours();
		String actualTitle = driver.getTitle();
	    System.out.println("Manage Tours Title: " +actualTitle);
	    String expectedTitle =AutomationConstants.MANAGE_TOURS_TITLE;
	    Assert.assertEquals(expectedTitle,actualTitle);
	    objDashbrd.clickTours();
		objDashbrd.clickSubTours();
	    objDashbrd.clickExtras();
		String actualTitle2 = driver.getTitle();
	    System.out.println("Extras Tours Title: " +actualTitle2);
	    String expectedTitle2 =AutomationConstants.EXTRAS_TOURS_TITLE;
	    Assert.assertEquals(expectedTitle2,actualTitle2);
		}
	@Test(priority=9)   //Verifying Bookings Link is redirected to Bookings page
	public void verifyBookings() throws IOException {  
		//Create DashBoard Page object	   
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.clickBookings();
		String actualTitle = driver.getTitle();
	    System.out.println("Unble to load Bookings Page : " + actualTitle);
	    String expectedTitle =AutomationConstants.SUPPLIER_BOOKINGS_TITLE;
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	}