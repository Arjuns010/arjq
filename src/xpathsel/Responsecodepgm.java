package xpathsel;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void Linkcount() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		 
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid---"+baseurl);
		}
		else
		{
			System.out.println("invalid---"+baseurl);
			
		}
		
				
	}

}
