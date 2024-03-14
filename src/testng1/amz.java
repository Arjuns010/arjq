package testng1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amz {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void amzn()
	{
		driver.get("https://www.amazon.in");
	}
	@Test
	public void Tests() throws Exception
	{
	
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		String s = driver.getTitle();
		String ExpectedTitle = "Amazon.in:mobile phones";
		if(s.equals(ExpectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]")).click();
	
		
		String Parentwindow=driver.getWindowHandle();
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	   Set<String> allwindow=driver.getWindowHandles();
	   
	   for(String handle:allwindow)
	   {
		  
		  if(!handle.equalsIgnoreCase(Parentwindow))
		   {
			  driver.switchTo().window(handle);
			  driver.manage().window().maximize();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	}
	
	   }
}
}
	
	
	
	


