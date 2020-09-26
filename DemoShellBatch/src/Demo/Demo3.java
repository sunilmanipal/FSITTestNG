package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		//You are passing the value to the edit box /if i want to fetcht he value from the edit box
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("submit")).click();
		//how to work with links and click on links
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		Thread.sleep(4000);
		// Drop Down in a web Application//WebElemet is to save an element in a variable
		WebElement DD = driver.findElement(By.name("fromPort"));
		//THis is to click on the drop down and select the value required
		Select selc = new Select(DD);
		//I want to find out what are the different values present in the DD
		//using getoptions to fetch the size of the drop down
		List<WebElement>values = selc.getOptions();
		System.out.println(values.size());
		for(int i=0;i<values.size();i++)
		{
			// I am using getText to get all te values 
			String value = values.get(i).getText();
			System.out.println(value);
		}
		selc.selectByVisibleText("London");
		selc.selectByIndex(1);
		//i used the first class preference 
		driver.findElement(By.xpath("//*[@name='servClass' and @value='First']")).click();
		driver.findElement(By.name("findFlights")).click();
	}

}
