package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.NewprojectUi;

public class Newproject {

	WebDriver driver; 

	public Newproject(WebDriver driver) {
		 
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void newproj() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(NewprojectUi.newp).click();
	//driver.findElement(NewprojectUi.play).click();
	

	}
}