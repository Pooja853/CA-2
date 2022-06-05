package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.SearchUi;

public class SearchPage {

	WebDriver driver;  

	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void search() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().back();
		
		//driver.findElement(SearchUi.coll).click();
		driver.findElement(SearchUi.ul).sendKeys("Nagarbhavi,Bengaluru,Karnataka,India");
		driver.findElement(SearchUi.drop).click();
			
		
	}
	
}
