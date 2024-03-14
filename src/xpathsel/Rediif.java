package xpathsel;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediif {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    driver.manage().window().maximize();
	   
	}
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]//tr[3]//td[3]")).click();
    }
}
