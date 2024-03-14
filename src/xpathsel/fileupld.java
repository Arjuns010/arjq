package xpathsel;

//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.ClipboardOwner;
//import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupld {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void robupld()
	{
		driver.get("https://www.ilovepdf.com/compress_pdf");
	}
	@Test
	public void test()
	{
		 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		//driver.findElement(By.xpath(""));
		 
		//StringSelection strSrlection=new StringSelection(p);
		//ClipboardOwner str;
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSrlection, str);
		//Robot robot=new Robot();
		//robot.delay(3000);
		
	}
	

}
