package com.phptravels.scriptsSG4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelspages.stage4.LoginPageSG4;


public class TestClassLoginSG4 extends TestBase {
	
	LoginPageSG4 objLogin;
	
	@Test(priority=1)   //Verifying valid username and invalid password by selecting Admin
	public void verifyIeVp() throws IOException {  
		//Create Login Page object	   
		objLogin = new LoginPageSG4(driver);
		objLogin.clickSupplierBack();
		objLogin.redirectSupplierPage();    
	    String email = ExcelUtility.getCellData4(1, 1);
	    String password = ExcelUtility.getCellData4(1, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton();    		    
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle =AutomationConstants.SUPPLIER_INVALID_TITLE;	    
	    Assert.assertEquals(actualTitle,expectedTitle);
	 				    
	    }
	
	@Test(priority=2, enabled=false)   //Verifying valid username and invalid password by selecting 
	public void verifyVeIp() throws IOException {  
		//Create Login Page object	   
		objLogin = new LoginPageSG4(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();  
	    String email = ExcelUtility.getCellData4(2, 1);
	    String password = ExcelUtility.getCellData4(2, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton();
	    String expectedTitle =AutomationConstants.SUPPLIER_INVALID_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);
			    
	    }
	
	@Test(priority=3, enabled=false)   //Verifying valid username and invalid password by selecting Admin
	public void verifyIeIp() throws IOException {  
		//Create Login Page object	   
		objLogin = new LoginPageSG4(driver);		
		objLogin.clearEmail();
		objLogin.clearPassword();   
	    String email = ExcelUtility.getCellData4(3, 1);
	    String password = ExcelUtility.getCellData4(3, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton();	    	
	    String expectedTitle =AutomationConstants.SUPPLIER_INVALID_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	    
	@Test(priority=4, enabled=false)   //Verifying valid username and invalid password by selecting Admin
	public void verifyNeNp() throws IOException {  
		//Create Login Page object	   
		objLogin = new LoginPageSG4(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();	    
	    String email = ExcelUtility.getCellData4(4, 1);
	    String password = ExcelUtility.getCellData4(4, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton(); 
	    String expectedTitle =AutomationConstants.SUPPLIER_INVALID_TITLE;
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle,actualTitle);			    
	    }
	 
	@Test(priority=5)   //Verifying valid username and invalid password by selecting Admin
	public void verifyVeVp() throws IOException, InterruptedException  {  
		//Create Login Page object	   
		objLogin = new LoginPageSG4(driver);
		objLogin.clearEmail();
		objLogin.clearPassword();	    
	    String email = ExcelUtility.getCellData4(5, 1);
	    String password = ExcelUtility.getCellData4(5, 2);
	    objLogin.setEmail(email);
	    objLogin.setPassword(password); 
	    objLogin.clickLoginButton(); 
	   Thread.sleep(2000);
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle =AutomationConstants.SUPPLIER_LOGIN_TITLE;
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
}

}
