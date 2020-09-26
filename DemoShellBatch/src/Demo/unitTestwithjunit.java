package Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class unitTestwithjunit {
	
	@Before
	public void before()
	{
		Assert.assertEquals("sunil", "Manipal");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is testcase1");
	}
	
	@After
	public void after()
	{
		System.out.println("This is at the end");
	}

}
