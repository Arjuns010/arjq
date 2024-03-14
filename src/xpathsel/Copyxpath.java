package xpathsel;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copyxpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	   
	}
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Rithikperumvazha");
	
		
	}
	
	
	

}
