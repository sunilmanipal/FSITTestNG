package Testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	
	@BeforeClass
	public void bc()
	{
		System.out.println("this is before all classess 2");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is after each method ");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is ethod 2");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("This is ethod 3");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is after each method");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("this is after all classess 2");
	}
	
	
	@AfterTest
	public void at()
	{
		System.out.println("This is after suite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("This is last");
	}
}
