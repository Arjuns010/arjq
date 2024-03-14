package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class toolsqa {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void tools()
    {
    	driver.get("https://demoqa.com/droppable/");
    }
    @Test
    public void test()
    {
    WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
   
    	WebElement Dropp=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    	Actions act=new Actions(driver);
    	act.dragAndDrop(drag, Dropp);
    	act.perform();
    	String text=Dropp.getText();
    	
    	if(text.equals("Dropped"))
    	{
    	System.out.println("pass");	
    	}
    	else
    	{
    		System.out.println("fail");
    	}
    	
    }
}
