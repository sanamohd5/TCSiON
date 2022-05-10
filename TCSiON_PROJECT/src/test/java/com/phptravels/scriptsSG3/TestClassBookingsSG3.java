package com.phptravels.scriptsSG3;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage3.BookingsPageSG3;

public class TestClassBookingsSG3 extends TestBase{
	
	BookingsPageSG3 objBookings;
	
	@Test(priority=6)   //Verifying Bookings link is redirected to bookings page
	public void verifyBookings() throws IOException {  
		objBookings = new BookingsPageSG3(driver);
		objBookings.clickBookings();
	}
		
	@Test(priority = 7) //Verifying Bookings status is changed from pending to confirm
	public void VerifyPendingToConfirm() throws InterruptedException, IOException {	
		String PendingBC=objBookings.setPendingBookCount();		
		String zero="0";
		
		if(PendingBC.contains(zero)) {
			System.out.println("Pending Bookings Count is Empty");
		}
		else {	
			objBookings.setPendingBookCount();
			System.out.println("Pending Bookings Count: "+PendingBC);
			String bookingstatus = ExcelUtility.getCellData3(9, 1);
			objBookings.setBookingStatusPC(bookingstatus);	
			driver.navigate().refresh();
			String ConfirmBC=objBookings.setConfirmBookCount();
			System.out.println("verifying pending to confirm, so confirmed Bookings Count changed to: "+ConfirmBC);

		}
	}
	@Test(priority = 8) //Verifying Delete button in cancelled bookings entries
	public void VerifyDeleteCancelledBookings() throws IOException, InterruptedException {
				
	
		Thread.sleep(2000);
		String CancelBC=objBookings.setCancelledBookCount();
		String zero="0";
		
		if(CancelBC.contains(zero)) {
			objBookings.clickConfirmBook();
			Thread.sleep(2000);
			objBookings.setBookingStatusCC();
			Thread.sleep(2000);
			objBookings.clickCancelledBook();
			objBookings.clickDelete();			
			Thread.sleep(2000);
			// not deleting the booking, because other users need it
			driver.switchTo().alert().dismiss();
		}
		else {	
			objBookings.setCancelledBookCount();
			System.out.println("Cancelled Bookings Count: "+CancelBC);
			objBookings.clickCancelledBook();
			objBookings.clickDelete();			
		// not deleting the booking, because other users need it
		driver.switchTo().alert().dismiss();
		}
	}

	@Test(priority = 9) //Verifying unpaid is changed to paid bookings
	public void RevertChanges() throws InterruptedException {
		objBookings = new BookingsPageSG3(driver);
		
		String CancelledBC=objBookings.setCancelledBookCount();
		String zero="0";
		if(CancelledBC.contains(zero)) {
			System.out.println("Cancelled count is empty ");
			
		}
		else {
		
			objBookings.setCancelledBookCount();
			System.out.println("Cancelled Bookings Count: "+ CancelledBC);
			objBookings.clickCancelledBook();
			Thread.sleep(2000);
			objBookings.setBookingStatusCPaid();
			Thread.sleep(2000);
			
		}
		
	}
	@Test(priority = 10) //Verifying invoice page under paid bookings
	public void VerifyInvoicePaidBookings() throws InterruptedException {
		objBookings = new BookingsPageSG3(driver);	
		String PaidBC=objBookings.setPaidBookCount();
		String zero="0";
		
		if(PaidBC.contains(zero)) {
			System.out.println("Paid Bookings Count is Empty");
		}
		else {	
			objBookings.clickPaidBook();			
			System.out.println("Paid Bookings Count: "+PaidBC);
			objBookings.clickInvoice();
			objBookings.confirmBookingInvoice();
			Thread.sleep(2000);
			String actualTitle = driver.getCurrentUrl();
			System.out.println("Invoice Page Link: " +actualTitle);			
			String expectedTitle ="https://www.phptravels.net/api/admin/bookings/paid";
			Assert.assertEquals(actualTitle,expectedTitle);
		

		}
	}
	@Test(priority=11)   //Verifying whether Website Link is redirected
	public void verifyWebsiteLink() throws IOException, InterruptedException {  
		objBookings = new BookingsPageSG3(driver);
		driver.getCurrentUrl();
		objBookings.viewWebsite();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		System.out.println("Website Title: "+actualTitle);		
		String expectedTitle =AutomationConstants.WEBSITE_TITLE;
		Assert.assertEquals(actualTitle,expectedTitle);

	}
	
}
