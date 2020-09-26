package Testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo7 {
	
	
	@Test(groups={"Smoke"})
	public void testcase1()
	{
		System.out.println("This is smoke Testing");
	}

	
	@Test(groups={"regression"})
	public void testcase2()
	{
		System.out.println("This is regression Testing");
	}
	
	@Test(groups={"Smoke"})
	public void testcase3()
	{
		System.out.println("This is smoke Testing");
	}
}
