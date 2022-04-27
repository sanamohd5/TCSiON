package com.phptravels.scriptsSG3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility3;
import com.phptravelspages.stage3.BookingsPageSG3;

public class TestClassBookingsSG3 extends TestBase{
	
	BookingsPageSG3 objBookings;
	@Test(priority=6)   //Verifying valid username and invalid password by selecting Admin
	public void verifyBookings() throws IOException {  
		objBookings = new BookingsPageSG3(driver);
		objBookings.clickBookings();
		objBookings.clickInvoice();
		objBookings.confirmBookingInvoice();
		String actualTitle = driver.getTitle();
		String expectedTitle =AutomationConstants.ADMIN_TITLE;
		Assert.assertEquals(actualTitle,expectedTitle);

}
	@Test(priority=7)   //Verifying valid username and invalid password by selecting Admin
	public void verifyBookingStatus() throws IOException, InterruptedException {  
		objBookings = new BookingsPageSG3(driver);
		String bookingstatus = ExcelUtility3.getCellData(9, 1);
		Thread.sleep(3000);
		objBookings.setBookingStatus(bookingstatus);
	}
	@Test(priority=8)   //Verifying valid username and invalid password by selecting Admin
	public void verifyWebsiteLink() throws IOException, InterruptedException {  
		objBookings = new BookingsPageSG3(driver);
		objBookings.viewWebsite();
		objBookings.viewWebsite2();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Thread.sleep(2000);
		String expectedTitle =AutomationConstants.HOME_PAGE_TITLE;
		Assert.assertEquals(actualTitle,expectedTitle);
	}
}
