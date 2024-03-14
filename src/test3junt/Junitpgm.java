package test3junt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {
	@Before
	public void browseropen()
	{
		System.out.println("browser open");

	}
     @Test
     public void test()
     {
    	 System.out.println("test activity");
   
     }
     @After
     public void browserclose()
     {
    	 System.out.println("browser close");
     }
}

