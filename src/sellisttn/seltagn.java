package sellisttn;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seltagn {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
    @Test
    public void test()
    {
    	 List<WebElement> Li = driver.findElements(By.tagName("a"));
    	System.out.println(Li.size());
    	
    for(WebElement s:Li)
    {
    String link=s.getAttribute("href");
    String text =s.getText();
    System.out.println(link+"---"+text);
    }
    
    }
    }
    

