package Testng;

import org.testng.annotations.Test;

public class Demo5 {
	
	@Test
	public void bindu()
	{
		System.out.println("Welcome to class bindu");
	}

	
	@Test(timeOut=2000)//to wait for this time to complete the method execution
	public void dhanya() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Welcome to class Dhanya");
	}
	
	@Test(enabled=false)//this method will not get executed
	public void cat()
	{
		System.out.println("Welcome to class cat");
	}
	
	@Test
	public void aditi()
	{
		System.out.println("Welcome to class aditi");
	}

}
