package com.phptravels.scriptsSG1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravelspages.stage1.AddFundsPageSG1;

public class TestClassAddFundsSG1 extends TestBase {
	AddFundsPageSG1 objAddFunds;
	@Test(priority=7)  
	public void verifyAddFunds() throws IOException, InterruptedException {  
		objAddFunds =new AddFundsPageSG1(driver);
		objAddFunds.clickAddFunds();
		objAddFunds.clickPayPal();
		objAddFunds.clearAddPrice();
		objAddFunds.AddPrice();		
		Thread.sleep(2000);
		objAddFunds.clickPayNow();
		Thread.sleep(2000);
		String expectedTitle =AutomationConstants.AUTOMATEDPAYMENT;
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    objAddFunds.clickBacktoInvoice();
	    objAddFunds.clickYes();
}
	
	}
