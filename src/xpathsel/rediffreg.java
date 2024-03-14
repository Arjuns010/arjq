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

public class rediffreg {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	
	}
	@org.junit.Test
	public void Test()
	{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 WebElement button = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	 String buttontext=button.getAttribute("value");
	 if(buttontext.equals("Create my account >>"))
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	 WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	 Select d=new Select(day);
	 d.selectByValue("01");
	 
	 
	 WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	 Select m=new Select(month);
	 m.selectByIndex(2);
	  
	 WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	 Select y=new Select(year);
	 y.selectByVisibleText("2000");
	 
	 List<WebElement> Li=d.getOptions();
	 System.out.println(Li.size());
	 
	 List<WebElement> Mi=m.getOptions();
	 System.out.println(Mi.size());
	 
	 List<WebElement> Ui=y.getOptions();
	 System.out.println(Ui.size());
	}
	 
	 @Test
	 public void Test1() throws IOException
	 {
	 File src=(File)driver.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src,new File("D:\\error.png"));
}
}
