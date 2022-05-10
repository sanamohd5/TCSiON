package com.phptravels.scriptsSG1;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage1.MyProfilePageSG1;


public class TestClassMyProfileSG1 extends TestBase {
	
	MyProfilePageSG1 objMyProfile;
	
	@Test(priority=8)  //Verifying My Profile Link
	public void verifyMyProfile() throws IOException{
		objMyProfile = new MyProfilePageSG1(driver);
		objMyProfile.clickMyProfile();
	}
		@Test(priority=9)  //Updating address in My Profile 
		public void UpdateAddress() throws IOException{
			objMyProfile = new MyProfilePageSG1(driver);
		    String state = ExcelUtility.getCellData(10, 2);
		    String city = ExcelUtility.getCellData(10, 3);
		    String postalcode = ExcelUtility.getCellData(10, 4);
		    String address = ExcelUtility.getCellData(10, 5);
		    String address2 = ExcelUtility.getCellData(10, 6);
		    objMyProfile.clearState();
			objMyProfile.setState(state);
			objMyProfile.clearCity();
			objMyProfile.setCity(city);
			objMyProfile.clearPostalCode();			
			objMyProfile.setPostalCode(postalcode);
			objMyProfile.clearAddress();
			objMyProfile.setAddress(address);
			objMyProfile.clearAddress2();
			objMyProfile.setAddress2(address2);
			objMyProfile.clickUpdateProfile();
			String actualMessage=driver.getCurrentUrl();
			System.out.println("Updated Profile Successfully : " + actualMessage);
			String expectedMessage = "https://www.phptravels.net/account/profile/success";
		   Assert.assertEquals(expectedMessage, actualMessage);
		}
		@Test(priority=10)  //Verifying Logout button
		public void verifyLogout() throws IOException{
			objMyProfile = new MyProfilePageSG1(driver);
			objMyProfile.clickLogout();
			}
		}
