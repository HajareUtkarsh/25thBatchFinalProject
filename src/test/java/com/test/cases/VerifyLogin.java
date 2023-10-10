package com.test.cases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.object.page.model.LoginPageObject;
import com.resourses.BaseClass;

public class VerifyLogin extends BaseClass{
	
	@Test
	public void verifyLogin() throws IOException {
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObject obj = new LoginPageObject(driver);
		
		FileInputStream fs = new FileInputStream("E:\\Stability\\dataofhandling.xlsx"); 
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0); 
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		String lgnData = sheet.getRow(0).getCell(0).getStringCellValue();
		String passData = sheet.getRow(0).getCell(1).getStringCellValue();
		
		obj.enterUserName().sendKeys(lgnData);
		obj.enterPassword().sendKeys(passData);
		obj.login().click();
	}
}
