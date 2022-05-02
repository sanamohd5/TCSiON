package com.phptravels.scriptsSG3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage3.LoginPageSG3;


public class TestClassLoginSG3 extends TestBase {

	LoginPageSG3 objLogin;
	
		@Test(priority=1)   //Verifying invalid email and valid password
		public void verifyIeVp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clickAdminBack();
			objLogin.redirectAdminPage();    
		    String email = ExcelUtility.getCellData3(1, 1);
		    String password = ExcelUtility.getCellData3(1, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();    		    
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;	    
		    Assert.assertEquals(actualTitle,expectedTitle);
		 				    
		    }
		
		@Test(priority=2)   //Verifying valid email and invalid password
		public void verifyVeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();  
		    String email = ExcelUtility.getCellData3(2, 1);
		    String password = ExcelUtility.getCellData3(2, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
				    
		    }
		
		@Test(priority=3)   //Verifying invalid email and invalid password
		public void verifyIeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);		
			objLogin.clearEmail();
			objLogin.clearPassword();   
		    String email = ExcelUtility.getCellData3(3, 1);
		    String password = ExcelUtility.getCellData3(3, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();	    	
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		    }
		    
		@Test(priority=4)   //Verifying null email and null password
		public void verifyNeNp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData3(4, 1);
		    String password = ExcelUtility.getCellData3(4, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);			    
		    }
		 
		@Test(priority=5)   //Verifying valid email and valid password
		public void verifyVeVp() throws IOException, InterruptedException  {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility.getCellData3(5, 1);
		    String password = ExcelUtility.getCellData3(5, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		   Thread.sleep(2000);
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    String expectedTitle =AutomationConstants.ADMIN_LOGIN_TITLE;
		    Assert.assertEquals(expectedTitle,actualTitle);
		  
}
		}

