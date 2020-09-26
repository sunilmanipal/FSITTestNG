package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException  {
		// API line by line which does different functioanlity
		//this line is required do understand the browser driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
		//if you guys are using firefox , then you have to download gecko driver
		//System.setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
		//This line is basically to open a new instance of chrome browser 
		//System.setproperty("webdriver.ie.driver","path of the Ie driver")
		WebDriver driver = new ChromeDriver();
		//This will work only for chomre 
		//ChromeDriver driver = new ChromeDriver();
		//interface, which contains all the browser details you can use web driver and work with any browser
		//This line is for opening the Required Application 
		//maximize my screen
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//is for closing the browser
		//This is line which will perform click on username/Locators
		driver.findElement(By.name("txtUsername")).click();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		//clear is used the remove the data
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).clear();
		String beforeLogin = driver.getTitle();
		System.out.println(beforeLogin);
		String urlofthecurrentpage = driver.getCurrentUrl();
		String id = driver.findElement(By.xpath("//*[@name='txtUsername']")).getAttribute("id");
		System.out.println(id);
		driver.findElement(By.xpath("//*[@id='"+id+"']")).sendKeys("Admin");
		String username = driver.findElement(By.xpath("//*[@name='txtUsername']")).getAttribute("value");
		
		System.out.println(username);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String afterLogin = driver.getTitle();
		System.out.println(afterLogin);
		if(beforeLogin.equals(afterLogin))
		{
			System.out.println("title is same please logout");
			//you guys to write logout code and show me
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(5000);
			
		}
		else
		{
			System.out.println("Title is not same please check");
			Thread.sleep(5000);
			driver.close();
		}
		
		
	}

}