package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.MenuUi;

public class Menupage {

	WebDriver driver; 

	public Menupage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void menu() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(MenuUi.menu).click();
	driver.findElement(MenuUi.plan).click();
	
	if(driver.getPageSource().contains("STARTS AT")) {
		System.out.println("text is verified");
	}
	}
}
