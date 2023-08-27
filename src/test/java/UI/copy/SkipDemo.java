package UI.copy;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class SkipDemo extends CommonDataSetup {

	
	boolean database=false;
	
	@Test(enabled=true)
	public void skipTest1()
	{
		System.out.println("skipping this test as it is not complete");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("skipping the test forcefully");
		throw new SkipException("skip this test");
	}
	
	@Test
	public void skipTest3()
	{
		System.out.println("skipint this test as it is not complete");
		if(database==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Dont execute the testcase");
			throw new SkipException("Dont execute the testcase");
		}
	}
	
}
