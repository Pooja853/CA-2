package com.utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.reusable.Helperr;


public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuit() {
		
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		ExtentSparkReporter extent=new ExtentSparkReporter(new File("./Reports/test"+Helperr.getCurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);

		
	}
	
	@BeforeClass
	public void setup() {
		Reporter.log("trying to start browser and ready",true);
		
		driver=BrowserFactory.startApp(driver,config.getBrowser(),config.getURL());
		
		Reporter.log("application and browser is running",true);
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
	BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws InterruptedException {
	
		Reporter.log("Test is going to end",true);
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			Helperr.captureScreenshot(driver);
			logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helperr.captureScreenshot(driver)).build());
		}
		
		report.flush();
		
		Reporter.log("completed successfully...Report generated",true);
		
	}
}
