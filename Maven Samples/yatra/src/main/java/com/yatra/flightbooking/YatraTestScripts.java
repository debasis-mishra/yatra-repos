package com.yatra.flightbooking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yatra.uicontrols.ControlGetter;
import com.yatra.uicontrols.ControlSetter;
import com.yatra.utils.BrowserUtils;

import org.junit.Assert;

public class YatraTestScripts {
	
	BrowserUtils browser;
	ControlGetter getter;
	ControlSetter setter;
	public YatraTestScripts()
	{
		browser = new BrowserUtils();
		getter = new ControlGetter();
		setter = new ControlSetter();
	}
	
	@Before
	public void setup()
	{
		browser.setup();
	}
	
	@Test
	public void test() {
		getter.getOriginCity();
		setter.setOriginCity("Bhubaneswar");
		Assert.assertEquals(true, false);
		
	}

	@After
	public void teardown()
	{
		browser.teardown();
	}
}
