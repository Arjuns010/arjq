package test4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbsearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
    @Test
    public void test()
    {
    	driver.findElement(By.id("email")).sendKeys("abc123");
    
    ((WebElement) driver.findElements(By.id("pass"))).sendKeys("hgh");
    ((WebElement) driver.findElements(By.name("login"))).click();
}
}
