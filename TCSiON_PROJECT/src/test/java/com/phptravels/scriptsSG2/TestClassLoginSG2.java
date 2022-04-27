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
	
		@Test(priority=1)   //Verifying valid username and invalid password by selecting Admin
		public void verifyIeVp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
			objLogin.clickAgentFront();
		    objLogin.redirectAgentPage();  
		    String email = ExcelUtility.getCellData2(1, 1);
		    String password = ExcelUtility.getCellData2(1, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();    
		//    WebDriverWait wait=new WebDriverWait(driver,3);	  
		//    wait.until(ExpectedConditions.alertIsPresent());   
		   
//		    String actualMessage=objLogin.GetErrorMsg();
//		    System.out.println('a');
//		    String expectedMessage = AutomationConstants.LOGIN_ERROR_MESSAGE;	  
		//    Assert.assertEquals(expectedMessage, actualMessage);
		    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		 				    
		    }
		
		@Test(priority=2)   //Verifying valid username and invalid password by selecting Admin
		public void verifyVeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
		//	driver.navigate().refresh();
			objLogin.clearEmail();
			objLogin.clearPassword();
		 //   objLogin.clickLogin();	    
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
		
		@Test(priority=3)   //Verifying valid username and invalid password by selecting Admin
		public void verifyIeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
		//	driver.navigate().refresh();
			objLogin.clearEmail();
			objLogin.clearPassword();
		//    objLogin.clickLogin();	    
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
		@Test(priority=4)   //Verifying valid username and invalid password by selecting Admin
		public void verifyNeNp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
		//	driver.navigate().refresh();
			objLogin.clearEmail();
			objLogin.clearPassword();
		 //   objLogin.clickLogin();	    
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
		    
		@Test(priority=5)   //Verifying valid username and invalid password by selecting Admin
		public void verifyVeVp() throws IOException  {  
			//Create Login Page object	   
			objLogin = new LoginPageSG2(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();
		 //   objLogin.clickLogin();	    
		    String email = ExcelUtility.getCellData2(5, 1);
		    String password = ExcelUtility.getCellData2(5, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		    String expectedTitle =AutomationConstants.LOGINPAGETITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		   // Thread.sleep(2000);
}}
