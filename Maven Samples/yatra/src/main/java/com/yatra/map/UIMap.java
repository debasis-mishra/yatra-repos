package com.yatra.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class UIMap {
	String filepath = "../yatra/src/main/resources/flightsearch_obj_repos.properties";
	Properties prop = new Properties();
	InputStream input = null;
	Map<String, String> hmap = new HashMap<String, String>();
	
	public UIMap() throws FileNotFoundException,IOException
	{
		File file = new File(filepath);
		input = new FileInputStream(file);
		// load a properties file
		prop.load(input);
		
		Enumeration keys = prop.propertyNames();
        while(keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            hmap.put(key,prop.getProperty(key));
        }
	}
	
	public String readProperty(String key)
	{
		return (String)prop.getProperty(key);
	}
}
