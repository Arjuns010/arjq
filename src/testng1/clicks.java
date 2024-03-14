package testng1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class clicks {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		}
	
	@org.testng.annotations.Test
	public void Test()
	{
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	
		act.contextClick(rightclick);
		WebElement rightclick1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rightclick1);
		act.build().perform();
		Alert a=driver.switchTo().alert();
    	String text=a.getText();
    	if(text.equals("clicked: edit"))
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("fail");
    	
    	}
    	a.accept();
	}
    	@org.testng.annotations.Test
    	public void test1()
    	{
    		Actions act1=new Actions(driver);
    		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"//*[@id=\"authentication\"]/button"));
    		act1.contextClick(doubleclick);
    		act1.build().perform();
    		Alert al=driver.switchTo().alert();
        	String text1=al.getText();
        	if(text1.equals("You double clicked me.. Thank You.."))
        	{
        		System.out.println("pass");
        	}
        	else
        	{
        		System.out.println("fail");
        	
        	}
        	al.accept();
    		
    	
    		
    		}
	

}

