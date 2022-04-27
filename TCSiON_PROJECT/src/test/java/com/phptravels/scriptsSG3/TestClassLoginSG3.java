package com.phptravels.scriptsSG3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility3;
import com.phptravelspages.stage3.LoginPageSG3;


public class TestClassLoginSG3 extends TestBase {

	LoginPageSG3 objLogin;
	
		@Test(priority=1)   //Verifying valid username and invalid password by selecting Admin
		public void verifyIeVp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clickAdminBack();
			objLogin.redirectAdminPage();    
		    String email = ExcelUtility3.getCellData(1, 1);
		    String password = ExcelUtility3.getCellData(1, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();    		    
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;	    
		    Assert.assertEquals(actualTitle,expectedTitle);
		 				    
		    }
		
		@Test(priority=2)   //Verifying valid username and invalid password by selecting Admin
		public void verifyVeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();  
		    String email = ExcelUtility3.getCellData(2, 1);
		    String password = ExcelUtility3.getCellData(2, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
				    
		    }
		
		@Test(priority=3)   //Verifying valid username and invalid password by selecting Admin
		public void verifyIeIp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);		
			objLogin.clearEmail();
			objLogin.clearPassword();   
		    String email = ExcelUtility3.getCellData(3, 1);
		    String password = ExcelUtility3.getCellData(3, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton();	    	
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);
		    }
		    
		@Test(priority=4)   //Verifying valid username and invalid password by selecting Admin
		public void verifyNeNp() throws IOException {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility3.getCellData(4, 1);
		    String password = ExcelUtility3.getCellData(4, 2);
		    objLogin.setEmail(email);
		    objLogin.setPassword(password); 
		    objLogin.clickLoginButton(); 
		    String expectedTitle =AutomationConstants.ADMIN_INVALID_TITLE;
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle,actualTitle);			    
		    }
		 
		@Test(priority=5)   //Verifying valid username and invalid password by selecting Admin
		public void verifyVeVp() throws IOException, InterruptedException  {  
			//Create Login Page object	   
			objLogin = new LoginPageSG3(driver);
			objLogin.clearEmail();
			objLogin.clearPassword();	    
		    String email = ExcelUtility3.getCellData(5, 1);
		    String password = ExcelUtility3.getCellData(5, 2);
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
