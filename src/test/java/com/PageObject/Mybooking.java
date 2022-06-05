package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.MybookingUi;

public class Mybooking {

	WebDriver driver; 

	public Mybooking(WebDriver driver) {
		
		this.driver=driver; 
	}
	
	@SuppressWarnings("deprecation")
	public void mybookings() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(MybookingUi.booking).click();
		//driver.findElement(newUi.Allnew).click();
		//driver.findElement(newUi.close).click();
		driver.getTitle();
		//driver.navigate().to(URL url);	
		
	}
}
