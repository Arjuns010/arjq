package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Actionpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void urloading()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    @org.testng.annotations.Test
    public void Test()
    {
    WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
    fullname.sendKeys("Prahalaadhan");
    WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
    rediffid.sendKeys("123");
    Actions act=new Actions(driver);
    act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
    act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
    act.keyDown(fullname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
    act.build().perform();
    
    }
}
