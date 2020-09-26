package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {
	WebDriver driver;
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
		//To open an URL i was using driver.get
		//i can also use driver.navigate.to to open the URL
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void testcase1()
	{
		WebElement un = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		un.sendKeys("Admin");
		//can i use GetText to fetch the username value
		String expectedname = "Admin";
		//Why getText doesnot work //we are trying to fetch the inner text of username 
		String actualname = un.getAttribute("value");
		System.out.println(actualname);
		Assert.assertEquals(actualname, expectedname);
	}
	
	
	@Test(priority=1,dependsOnMethods="testcase1", alwaysRun=true)
	public void testcase2()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actual = driver.findElement(By.id("welcome")).getText();
		String expected = "Welcome Linda";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=2,dependsOnMethods="testcase2",alwaysRun=true)
	public void testcase3() throws InterruptedException
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}

}
