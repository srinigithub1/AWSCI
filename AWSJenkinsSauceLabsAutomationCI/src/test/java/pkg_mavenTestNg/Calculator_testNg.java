// Generated by Selenium IDE
package pkg_mavenTestNg;
import java.lang.*;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import pkg_calculator.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.*;
public class Calculator_testNg {

	public static calculator objcalculator;
  
  @BeforeClass
  public void setUp() {
	  objcalculator =new calculator();
	 

  }
  @AfterClass
  public void tearDown() {
   System.out.println("closing test case exxecution");
  }
  
  @Test
	public void testAdditon() {
	  Reporter.log("Checking Addiotn funcaitonality");
	  
				
		Assert.assertEquals(18, objcalculator.addition(12, 6));
	}

	@Test
	public void testSubstraction() {
		Reporter.log("Checking Substrarciton funcaitonality");
		Assert.assertEquals( 6, objcalculator.Substraction(12, 6));
	}

	@Test
	public void testMultiplicaiton() {
		Reporter.log("Checking Mutliplication funcaitonality");
		Assert.assertEquals( 72, objcalculator.Multiplicaiton(12, 6));
	}
	
//	@Test
//	public void testprotectedMultiplicaiton() {
//		Assert.assertEquals("Checking Multiplicaiton funcaitonality", 72, objcalculator.protectedMultiplicaiton(12, 6));
//	}

	@Test
	public void testDivistion() {
		Reporter.log("Checking Division funcaitonality");
		Assert.assertEquals(6, objcalculator.divistion(12, 2));
		
	}
	
	
	
  //	Assert.assertEquals(true, false);
	
}
