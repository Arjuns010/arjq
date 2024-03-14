package test1;

import org.openqa.selenium.chrome.ChromeDriver;

public class fbtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Facebook";
		if(actualtitle.equals(expectedtitle))
		   {
			   System.out.println("pass");
			   
		   }
		   else
		   {
			   System.out.println("fail");

	}
	}
}

