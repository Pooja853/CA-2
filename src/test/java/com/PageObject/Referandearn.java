package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.utility.ExcelDataProvider;

import UiStore.ReferandearnUi;

public class Referandearn {

	WebDriver driver; 

	public Referandearn(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void refer() {
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.navigate().back();
	
	
	driver.findElement(ReferandearnUi.menu).click();
	driver.findElement(ReferandearnUi.click).click();
	
	
	
	} 
}
