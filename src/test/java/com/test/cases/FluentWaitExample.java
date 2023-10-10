package com.test.cases;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.resourses.BaseClass;

public class FluentWaitExample extends BaseClass{
	
	@Test
	public void fluentWait() throws IOException, InterruptedException {
		driverInitialize();
		driver.get("https://www.way2automation.com/way2auto_jquery/dropdown.php#load_box");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/select")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		WebElement ddwn = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/select/option[7]"));
			}
		});
		
		ddwn.click();
	}
}
