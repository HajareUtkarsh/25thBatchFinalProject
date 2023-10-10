package com.test.cases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	public void caputerScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		//TakesScreenshot srcShot = (TakesScreenshot)driver;
		File src = driver.findElement(By.xpath("//*[@id=\"wrapper\"]")).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Stability\\sf.png");
		FileUtils.copyFile(src, dest);
	}

}
