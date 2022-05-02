package com.phptravels.scriptsSG1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage1.LoginPageSG1;



public class TestClassLoginSG1 extends TestBase {
	LoginPageSG1 objLogin;
	@Test(priority=1)   //Verifying invalid email and valid password 
	public void verifyIeVp() throws IOException {  	   
		objLogin = new LoginPageSG1(driver);   //Create Login Page object	
		objLogin.clickCustomerFront();
		objLogin.redirectCustomerPage();			
		objLogin.clickCookie();
	    String email = ExcelUtility.getCellData(1, 1);
	    String password = ExcelUtility.getCellData(1, 2);
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
		objLogin = new LoginPageSG1(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();	    
	    String email = ExcelUtility.getCellData(2, 1);
	    String password = ExcelUtility.getCellData(2, 2);
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
		objLogin = new LoginPageSG1(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();	    
	    String email = ExcelUtility.getCellData(3, 1);
	    String password = ExcelUtility.getCellData(3, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton();	    	
	    String expectedTitle =AutomationConstants.INVALIDLOGINPAGETITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	@Test(priority=4)   //Verifying null email and null password
	public void verifyNeNp() throws IOException {     
		objLogin = new LoginPageSG1(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();	    
	    String email = ExcelUtility.getCellData(4, 1);
	    String password = ExcelUtility.getCellData(4, 2);
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
		objLogin = new LoginPageSG1(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();    
	    String email = ExcelUtility.getCellData(5, 1);
	    String password = ExcelUtility.getCellData(5, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton(); 
	    String expectedTitle =AutomationConstants.LOGINPAGETITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	}
