package Demo;

import java.util.List;

import org.openqa.grid.selenium.node.ChromeMutator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome driver 85\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//i want to check userame field is enable/disable 
		//to store any element in a varibale you can use WebElement
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("Admin");
		}
		if(driver.findElement(By.xpath("//*[@id='txtUsername']")).isDisplayed())
		{
		
			System.out.println("Displayed");
			//i want to login to the app and find out how many links are there
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			//since i have logged in i have to find out how many links are there
			//findElement (is for one Element and //FindElements(this is for multiple elements)
			List<WebElement> links = driver.findElements(By.tagName("a"));
			//how many there
			System.out.println(links.size());
			//But i want to print the names of all the links 
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
		}
		else
		{
			System.out.println("Not displayed");
		}
		
	}

}
