package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class testng {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("This will Execute first");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("This is before all test");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This will execute before the class starts");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This will execute before each method");
	}

	@Test
	public void testcase1()
	{
		System.out.println("This is my first test Case");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is my second test Case");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This will execute after each method");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("This will execute after all classess");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is at the After all test");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("This will Execute last");
	}
}
