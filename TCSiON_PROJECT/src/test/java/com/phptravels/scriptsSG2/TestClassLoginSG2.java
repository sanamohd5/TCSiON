package com.phptravels.scriptsSG2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage2.LoginPageSG2;


public class TestClassLoginSG2 extends TestBase {
	LoginPageSG2 objLogin;
	
		@Test(priority=1)   //Verifying invalid email and valid password 
		public void verifyIeVp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
			objLogin.clickAgentFront();
		    objLogin.redirectAgentPage(); 
			objLogin.clickCookie();
		    String email = ExcelUtility.getCellData2(1, 1);
		    String password = ExcelUtility.getCellData2(1, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();    
		    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		 				    
		    }
		
		@Test(priority=2)   //Verifying valid email and invalid password 
		public void verifyVeIp() throws IOException {  	   
			objLogin = new LoginPageSG2(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData2(2, 1);
		    String password = ExcelUtility.getCellData2(2, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();
		    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
				    
		    }
		
		@Test(priority=3)   //Verifying invalid email and invalid password 
		public void verifyIeIp() throws IOException {     
			objLogin = new LoginPageSG2(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData2(3, 1);
		    String password = ExcelUtility.getCellData2(3, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();	    	
		    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		    }
		
		@Test(priority=4)   //Verifying invalid email and invalid password 
		public void verifyNeNp() throws IOException {  	   
			objLogin = new LoginPageSG2(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData2(4, 1);
		    String password = ExcelUtility.getCellData2(4, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);			    
		    }
		    
		@Test(priority=5)   //Verifying valid email and valid password 
		public void verifyVeVp() throws IOException  {     
			objLogin = new LoginPageSG2(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData2(5, 1);
		    String password = ExcelUtility.getCellData2(5, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		    String expectedTitle =AutomationConstants.LOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		 
}}
