package xpathsel;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsel {
	ChromeDriver driver;

	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	}
	@Test
	public void test() throws InterruptedException
	{
	Thread.sleep(1700);
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
	driver.findElement(By.xpath("//*[@id='nav-cart-text-container']/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc123");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();


	}

}
