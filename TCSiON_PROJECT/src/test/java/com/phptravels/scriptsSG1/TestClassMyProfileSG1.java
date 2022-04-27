package com.phptravels.scriptsSG1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage1.MyProfilePageSG1;


public class TestClassMyProfileSG1 extends TestBase {
	MyProfilePageSG1 objMyProfile;
	
	@Test(priority=8)  
	public void verifyMyProfile() throws IOException{
		objMyProfile = new MyProfilePageSG1(driver);
		objMyProfile.clickMyProfile();
	}
		@Test(priority=9)  
		public void UpdateAddress() throws IOException{
			objMyProfile = new MyProfilePageSG1(driver);
		//	String country = ExcelUtility.getCellData(10, 1);
		    String state = ExcelUtility.getCellData(10, 2);
		    String city = ExcelUtility.getCellData(10, 3);
		    String postalcode = ExcelUtility.getCellData(10, 4);
		    String address = ExcelUtility.getCellData(10, 5);
		    String address2 = ExcelUtility.getCellData(10, 6);
			objMyProfile.setCountry();
			objMyProfile.setState(state);
			objMyProfile.setCity(city);
			objMyProfile.clearPostalCode();			
			objMyProfile.setPostalCode(postalcode);
			objMyProfile.clearAddress();
			objMyProfile.setAddress(address);
			objMyProfile.setAddress2(address2);
			objMyProfile.clickUpdateProfile();
		//	objMyProfile.gettext();
		//	String actualMessage=objMyProfile.
//		    String expectedMessage = AutomationConstants.UPDATED_SUCCESSFULLY;	  
//		   Assert.assertEquals(expectedMessage, actualMessage);
		//   System.out.println());
		}
		@Test(priority=10)  
		public void verifyLogout() throws IOException{
			objMyProfile = new MyProfilePageSG1(driver);
			objMyProfile.clickLogout();
		}

}
