package com.test.cases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingExcelSheet {
	//apache poi is used to handle excel sheet
	
	public static WebDriver driver;
	@BeforeClass
	public void setDriver() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test(priority = 1)
	public void excelHandle() throws IOException { //research more on this exception
		FileInputStream fs = new FileInputStream("E:\\Stability\\dataofhandling.xlsx"); //selenium driver gets control for excel sheet
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0); //index value of sheet at bottom we get how many sheets are there in one .xlsx file 
		XSSFRow row = sheet.getRow(0); // first row therefore index value = 0. same applicable for above step.
		XSSFCell cell = row.getCell(0); // control is in first column first cell of the row
		
		String lgnData = sheet.getRow(0).getCell(0).getStringCellValue();
		String passData = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(lgnData);
		System.out.println(passData);
		
		WebElement lgn = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		lgn.sendKeys(lgnData);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(passData);
	}
	
	@AfterClass
	public void closeWin() {
		driver.close();
	}
}
