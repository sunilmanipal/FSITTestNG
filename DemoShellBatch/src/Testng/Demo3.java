package Testng;

import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(priority=0)
	public void bindu()
	{
		System.out.println("Welcome to class bindu");
	}

	
	@Test(priority=1)
	public void dhanya()
	{
		System.out.println("Welcome to class Dhanya");
	}
	
	@Test(priority=2)
	public void cat()
	{
		System.out.println("Welcome to class cat");
	}
	
	@Test(priority=3)
	public void aditi()
	{
		System.out.println("Welcome to class aditi");
	}
	

}
