package com.object.page.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.resourses.BaseClass;

public class LoginPageObject extends BaseClass {
	//public WebDriver driver;
	
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUserName() { //as xpaths are private so we wrote method
		return driver.findElement(username);
	}
	public WebElement enterPassword() {// if variable above if private then always return type is there
		return driver.findElement(password);
	}
	public WebElement login() {
		return driver.findElement(login);
	}
}
