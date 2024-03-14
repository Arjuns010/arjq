package Assignmenttng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assgntng {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void assign()
	{
		driver.get("https://rishiherbalindia.linker.store/");
		
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input"));
				email.sendKeys("shashidharan234@gmail.com");
		WebElement pw=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input"));
				pw.sendKeys("Sashidhar5");
				driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label")).click();
				driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
				driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
				driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
			
				driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
				//driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
				Thread.sleep(1500);
				
				//driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("shashidharan234@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sashidhar5");
				driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
				Thread.sleep(1000);
			WebElement search=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
			search.sendKeys("HERBAL AGRO GROWTH BOOSTER");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).isSelected();
			driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			
		}
	

}
