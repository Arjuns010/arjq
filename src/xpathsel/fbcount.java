package xpathsel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class fbcount {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	
	}
	@Test
	public void Test()
	{
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select da=new Select(day);
		da.selectByValue("3");
		
		driver.get("//*[@id=\"month\"]");
		 WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select mo=new Select(month);
		mo.selectByIndex(1);
		
		driver.get("//*[@id=\"year\"]");
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select ye=new Select(year);
		ye.selectByVisibleText("2024");
		
		
		
		 List<WebElement> Li=da.getOptions();
		 System.out.println(Li.size());
		 
		 List<WebElement> Mi=mo.getOptions();
		 System.out.println(Mi.size());
		 
		 List<WebElement> Ui=ye.getOptions();
		 System.out.println(Ui.size());
	}
		 @Test
		 public void Test1() throws IOException
		 {
		 File src=(File)driver.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src,new File("D:\\error2.png"));
		 
	}
	

}
