package xpathsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multinputs {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlupld()
	{
		driver.get("https://www.facebook.com/");
	}
    @Test
    public void test() throws IOException
    {
    	File f=new File("C:\\Users\\MY BOOK\\Downloads\\Book1.xlsx\\");
    	FileInputStream fe=new FileInputStream(f);
    	XSSFWorkbook ab=new XSSFWorkbook(fe);
    	XSSFSheet shi=ab.getSheet("Sheet1");
    	 
    	for(int i=1;i<=shi.getLastRowNum();i++)
    	{
    		String username=shi.getRow(i).getCell(0).getStringCellValue();
    		System.out.println(username);
    		String password=shi.getRow(i).getCell(1).getStringCellValue();
    		System.out.println(password);
    		
    		
    		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
    		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
    		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
    		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
    		driver.findElement(By.xpath("//*[@id=\"u_0_5_mm\"]")).click();
    		
    		
    		
    		
    	}
    }
    
    
}
