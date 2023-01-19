package Test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlyPrintStatement {
	@Test
	public void F2() {
		System.out.println("This is the function2");
		Reporter.log("Am inside function2");
	}

	@Test
	public void f1() {
		System.out.println("This is the function1");
		Reporter.log("Am inside function1");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is the afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is the afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is the afterSuite");
	}

}
