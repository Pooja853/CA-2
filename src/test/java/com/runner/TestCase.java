package com.runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Continue;
import com.PageObject.FooterPage;
import com.PageObject.Login;
import com.PageObject.Menupage;
import com.PageObject.Mybooking;
import com.PageObject.Newproject;
import com.PageObject.PayrentPage;
import com.PageObject.Postproperty;
import com.PageObject.Referandearn;
import com.PageObject.SearchPage;
import com.utility.BaseClass;
import com.utility.Log4j;

public class TestCase extends BaseClass {
		
	@Test(priority=1)
	public void footer() {
		
		logger=report.createTest("Footer-We Accept");
		FooterPage page=PageFactory.initElements(driver,FooterPage.class);
		logger.info("verify  text in  page test");
		page.footer();
		logger.pass("text verified");
	}
	
	@Test(priority=2)
	public void Menu() throws InterruptedException {
		
		logger=report.createTest("Menu we opened");
		Menupage page=PageFactory.initElements(driver,Menupage.class);
		logger.info("searching  text in the page test");
		page.menu();
		logger.pass("success");
	}
	@Test(priority=3)
	public void newproject() {
		
		logger=report.createTest("new project");
		Newproject page=PageFactory.initElements(driver,Newproject.class);
		logger.info("verify ' text is present in  test");
		page.newproj();
		logger.pass("text verified");
	}
	@Test(priority=4)
	public void Refer() {
		
		logger=report.createTest("Refer and Earn");
		Referandearn page=PageFactory.initElements(driver,Referandearn.class);
		logger.info("verify '250 Products' text under the top of heading test");
		page.refer();
		logger.pass("text verified");
		
	}
	
	@Test(priority=5)
	public void postproperty() {
		
		logger=report.createTest("postproperty");
		Postproperty page=PageFactory.initElements(driver,Postproperty.class);
		logger.info("verify  text in result page test");
		page.post();
		logger.pass("text verified");
		
	}
	

	@Test(priority=6)
	public void search() {  
		
		logger=report.createTest("Search page");
		SearchPage page=PageFactory.initElements(driver,SearchPage.class);
		logger.info("Verifying text presentin the page");
		page.search();
		logger.pass("success");
	}
	@Test(priority=7)
	public void mybooking() {
		
		logger=report.createTest("My booking");
		Mybooking page=PageFactory.initElements(driver,Mybooking.class);
		logger.info("verify text is displayed in heading test");
		page.mybookings();
		logger.pass("text verified");
	}
	
	@Test(priority=8)
	public void payrent() {
		
		logger=report.createTest("Pay Rent");
		PayrentPage page=PageFactory.initElements(driver,PayrentPage.class);
		logger.info("verify 'UL Picks' text is present in the page");
		page.rent();
		logger.pass("text verified");
		
	}
	
	
	
	@Test(priority=10)
	public void login() {
		
		logger=report.createTest("Login ");
		Login page=PageFactory.initElements(driver,Login.class);
		logger.info("verify text is displayed");
		page.login();
		logger.pass("text verified");
		
	}
	@Test(priority=9)
	public void continues() {
		
		logger=report.createTest("Continue searching");
		Continue page=PageFactory.initElements(driver,Continue.class);
		logger.info("verify the result is opened ");
		page.continnue();
		logger.pass("text verified");
		Log4j.createLog();
	}
	
}
