package com;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class TestCalculation3 {
	
	@Test
	public void testUnmatches() {
		boolean contentsAreSame =  "Hyderabad".equals("Bangalore");
		Assert.assertFalse(contentsAreSame, "String contents are not same");
	}

	@Test
	public void calculateInterest() {
		int interest = 10000*12*1/100;
		Assert.assertEquals(interest, 1200);
	}
	
	@Test
	public void subtractionOfTwoNumbers() {
	    int y = 125-75;
	    Assert.assertEquals(50, 50);
	}
	
	@Test
	public void testMatches() {
		Assert.assertEquals("Bangalore", "Bangalore", "String contents are same");
	}
	
	@Test
	public void additionOfTwoNumbers() {
	    int y = 125+75;
	    Assert.assertEquals(y, 200 , "addition of two numbers should be correct");
	}
	
	@BeforeTest
	public void beforeTest() throws Exception {
		
	}

	@AfterTest
	public void afterTest() {
		
	}

}
