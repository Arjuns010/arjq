package xpathsel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void upld()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
    @Test
    public void test() throws Exception
    {
    	Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\MY BOOK\\Downloads\\ASSIGNMENTHANDLINGARJ.pdf");
    driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
    }
}
