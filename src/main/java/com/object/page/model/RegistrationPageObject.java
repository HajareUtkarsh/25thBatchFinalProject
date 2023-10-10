package com.object.page.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {
	
	public WebDriver driver;
	private By fname = By.xpath("//input[@name='UserFirstName']");
	private By lname = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By jobTitle = By.xpath("//select[@name='UserTitle']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By empCount = By.xpath("//select[@name='CompanyEmployees']");
	private By phn = By.xpath("//input[@name='UserPhone']");
	private By cntr = By.xpath("//select[@name='CompanyCountry']");
	private By serviceAg = By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']");
	private By notif = By.xpath("(//div[@class='checkbox-ui'])[2]");
	
	public RegistrationPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement firstName() {
		return driver.findElement(fname);
	}
	public WebElement lastName() {
		return driver.findElement(lname);
	}
	public WebElement emailUser() {
		return driver.findElement(email);
	}
	public WebElement jobTitleUser() {
		return driver.findElement(jobTitle);
	}
	public WebElement companyUser() {
		return driver.findElement(company);
	}
	public WebElement employeeCount() {
		return driver.findElement(empCount);
	}
	public WebElement phone() {
		return driver.findElement(phn);
	}
	public WebElement contry() {
		return driver.findElement(cntr);
	}
	public WebElement serviceAgreement() {
		return driver.findElement(serviceAg);
	}
	public WebElement futureNotification() {
		return driver.findElement(notif);
	}
}
