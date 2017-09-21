package com.yatra.uicontrols;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.yatra.map.UIMap;
import com.yatra.utils.BrowserUtils;
import org.junit.Assert;

public class ControlGetter {

	UIMap map;
	
	public ControlGetter()
	{
		try
		{
			map = new UIMap();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Properties file not found!");
		}
		catch(IOException e)
		{
			System.out.println("Improper properties");
		}
	}
	
	public void getOriginCity()
	{
		String locator = map.readProperty("yatra.flightsearch.from");
		
		WebElement el = BrowserUtils.driver.findElement(By.id(locator));
		Assert.assertTrue(el.isDisplayed());
		Assert.assertTrue(el.isEnabled());
	}
}
