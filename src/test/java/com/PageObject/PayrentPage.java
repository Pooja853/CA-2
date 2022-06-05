package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.PayrentUi;

public class PayrentPage {

	WebDriver driver; 

	public PayrentPage(WebDriver driver) {
		
		this.driver=driver;
	}
		 
@SuppressWarnings("deprecation")
public void rent() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(PayrentUi.click).click();
	
	
	} 
}