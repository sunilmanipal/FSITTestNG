package Testng;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("This is first");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is after suite");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("this is before all classess 1");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is after each method 1 class");
	}
	
	@Test
	public void testcase1()
	{
		Assert.assertEquals("sunil", "Nishchith");
		System.out.println("This is ethod 1");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is after each method 1 class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("this is after all classess 1");
	}
	
	
}
