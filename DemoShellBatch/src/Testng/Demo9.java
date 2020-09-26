package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo9 {
	public WebDriver driver;
	
	@Parameters("mybrowser")
	@BeforeTest
	public void bt(String mybrowser)
	{
		if(mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(mybrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void testcase1()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	
	
	@AfterTest
	public void at() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	

}
