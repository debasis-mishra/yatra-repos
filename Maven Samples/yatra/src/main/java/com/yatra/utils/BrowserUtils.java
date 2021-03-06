package com.yatra.utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {

	public static WebDriver driver;
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
	}
	
	public void teardown()
	{
		Assert.assertNotNull("Driver object is null", driver);
		driver.close();
	}
	
	public static void highlightControl(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: Red; border: 2px dotted solid green;");
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "");
	}
}
