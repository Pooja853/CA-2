package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.utility.ExcelDataProvider;

import UiStore.LoginUi;

public class Login {

	WebDriver driver; 

	public Login(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void login() {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().back();
		
		ExcelDataProvider excel=new ExcelDataProvider();
		@SuppressWarnings("unused")
		String data=excel.getStringData("Input", 0, 0);
		
		//driver.findElement(SearchUi.input).sendKeys(data);
		driver.findElement(LoginUi.click1).click();
		
		//driver.findElement(LoginUi.clickligin).click();
		driver.findElement(LoginUi.username).sendKeys("7975850493");
		//driver.findElement(LoginUi.password).sendKeys("Pooja@123");
		driver.findElement(LoginUi.login).click();
		
		
		} 

	
}
