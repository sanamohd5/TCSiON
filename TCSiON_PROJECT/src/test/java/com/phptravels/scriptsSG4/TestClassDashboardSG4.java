package com.phptravels.scriptsSG4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage4.DashBoardSG4;

public class TestClassDashboardSG4 extends TestBase {
	
	DashBoardSG4 objDashbrd;
	
	@Test(priority=6)  
	public void verifyText() throws IOException {  
		//Create DashBoard Page object	   
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.testtext();
		}
	
	@Test(priority=7)   
	public void verifyTours() throws IOException {  
		//Create DashBoard Page object	   
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.clickTours();
		objDashbrd.clickSubTours();
		objDashbrd.clickManageTours();
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle =AutomationConstants.MANAGE_TOURS_TITLE;
	    Assert.assertEquals(expectedTitle,actualTitle);
	    objDashbrd.clickTours();
		objDashbrd.clickSubTours();
	    objDashbrd.clickExtras();
		String actualTitle2 = driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle2 =AutomationConstants.EXTRAS_TOURS_TITLE;
	    Assert.assertEquals(expectedTitle2,actualTitle2);
		}
	@Test(priority=8)   
	public void verifyBookings() throws IOException {  
		//Create DashBoard Page object	   
		objDashbrd = new DashBoardSG4(driver);
		objDashbrd.clickBookings();
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle =AutomationConstants.SUPPLIER_BOOKINGS_TITLE;
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	}