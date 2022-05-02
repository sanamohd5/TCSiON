package com.phptravels.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
    public static Properties prop = null;
    String driverPath1;
    String driverPath2;
   // String driverPath = "C:\\Users\\DELL\\Desktop\\Driver\\chromedriver.exe";
    
        public static void TestBase() {
        try {
        	prop = new Properties();   //Below line creates an object of Properties called 'prop'
        	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
        	+ "/config.properties");    //creates an object of FileInputStream,'ip' and Gives the path of properties file
        	prop.load(ip);              //Below line of code will load the property file
            } 
        catch (FileNotFoundException e) {
        	e.printStackTrace();
        	} 
        catch (IOException e) {
        	e.printStackTrace();
        	}
        }
@Parameters("browser")      
@BeforeTest
public void onSetup() {
	TestBase();    // for loading the configurations
    String browserName = prop.getProperty("browser");
    driverPath1=System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
    driverPath2=System.getProperty("user.dir")+"\\driver\\geckodriver.exe";
    
    if (browserName.equals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", driverPath1);
    	driver = new ChromeDriver();
    	}
else if (browserName.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", driverPath2);
	driver = new FirefoxDriver();
    }
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();   
    }
@AfterMethod
public void tearDown(ITestResult iTestResult) throws IOException {
    if (iTestResult.FAILURE == iTestResult.getStatus()) {
        takeScreenshot(iTestResult.getName());
    }
}
public String takeScreenshot(String name) throws IOException {
	
	
	/*Step 1) Convert web driver object to TakesScreenshot
      Step 2) Call getScreenshotAs method to create image file
      Step 3) Copy file to Desired Location*/
	
    String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
//Take the screenshot
    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
    String destination =  System.getProperty("user.dir") + "\\target\\" + name + dateName
            + ".png";
   
    File finalDestination = new File(destination);
 
    FileHandler.copy(source, finalDestination);
    //or FileUtils.copyFile import org.apache.commons.io.FileUtils;
    return destination;   
}
@AfterTest
public void quitBrowser() throws IOException, InterruptedException {
	Thread.sleep(2000);
	driver.quit();
	} 
	
}

	