package testng1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhndle {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void windowhndles() 
	{
	String Parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/p/a")).click();
    Set<String> allwindow=driver.getWindowHandles();
   
   for(String handle:allwindow)
   {
	  
	  if(!handle.equalsIgnoreCase(Parentwindow))
	   {
		  driver.switchTo().window(handle);
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("anand23@gmail.com");
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		  driver.close();
	   }
   driver.switchTo().window(Parentwindow);
   }
	}
	}

  	


	


