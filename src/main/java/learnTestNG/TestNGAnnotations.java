package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  // PreCondition
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is Before test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	@Test(priority=1)
	public void test1() {
	System.out.println("Execute test1");	
	} 
	@Test(priority=0)
	public void test0() {	
		System.out.println("Execute test0");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("Execute test3");
	}
	//PostCondition
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test");
	}
}
