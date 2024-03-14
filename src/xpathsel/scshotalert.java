package xpathsel;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class scshotalert {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/MY%20BOOK/OneDrive/Documents/and.html");
		
	}
    @org.junit.Test
    public void Test()
    {
    	driver.findElement(By.xpath("/html/body/input[1]")).click();
    	//driver.switchTo().alert().accept();
    	
    	Alert a=driver.switchTo().alert();
    	String text=a.getText();
    	if(text.equals("Hello!I am an alert box"))
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("fail");
    	
    	}
    	a.accept();
    	
    	
     	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abd");
     	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("babs");
     	
}
}
