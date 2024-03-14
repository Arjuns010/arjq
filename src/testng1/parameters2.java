package testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters2 {
	@Parameters("a")
	@Test
	public void main1(String b)
	{
		System.out.println("the value is:"+b);
	}

}
