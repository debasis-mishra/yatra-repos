package com.yatra.flightbooking;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//runner file for test suite
public class TestYatra {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(YatraTestSuite.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		  
	}
}
