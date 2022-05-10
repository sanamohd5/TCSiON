package com.phptravels.scriptsSG1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage1.MyBookingsPageSG1;

public class TestClassMyBookingsSG1 extends TestBase {
	MyBookingsPageSG1 objMyBookings;
	
	@Test(priority=6)  // Display voucher
	public void verifyMyBookings() throws IOException, InterruptedException  {  
		objMyBookings =new MyBookingsPageSG1(driver);
		objMyBookings.clickMyBookings();	  
		objMyBookings.DisplayVoucher();
		objMyBookings.setVoucherConfirm();
			    
	
	}
}
