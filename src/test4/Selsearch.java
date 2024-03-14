package test4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selsearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("RNNXgb")).sendKeys("selenium,Keys.ENTER");
		driver.findElement(By.name("UUbT9")).click();

	}

}
