package com.test.cases;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.object.page.model.RegistrationPageObject;
import com.resourses.BaseClass;

public class RegistrationSalesforce extends BaseClass{
	
	@Test
	public void registerSalesforce() throws IOException, InterruptedException {
		driverInitialize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		RegistrationPageObject obj = new RegistrationPageObject(driver);
		obj.firstName().sendKeys("Utkarsh");
		obj.lastName().sendKeys("Hajare");
		obj.emailUser().sendKeys("utkarsh.hajare@gmail.com");
		
		Select slt = new Select(obj.jobTitleUser());
		slt.selectByVisibleText("IT Manager");
		Thread.sleep(2000);
		
		obj.companyUser().sendKeys("utkarsh industries pvt. ltd.");
		
		Select slt2 = new Select(obj.employeeCount());
		slt2.selectByValue("2500");
		Thread.sleep(2000);
		
		obj.phone().sendKeys("7080828999");
		
		Select slt3 = new Select(obj.contry());
		slt3.selectByVisibleText("Saudi Arabia");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.click(obj.serviceAgreement()).build().perform();
		
		Actions act2 = new Actions(driver);
		act2.click(obj.futureNotification()).build().perform();
	}
}
