package UI.copy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;


public class GroupDemoTest2 extends CommonDataSetup{
	@BeforeClass
	
	
	@Test(priority=1,groups="regression")
	public void aTest1()
	{
		System.out.println("atest");
	}
	
	
	@Test(priority=2,groups="regression")
	public void bTest1()
	{
		System.out.println("bTest1");		
	}
	
	
	@Test(groups= {"regression","bvt"})
	public void bTest2()
	{
		System.out.println("bTest2");		
	}
	
	
	@Test(groups="bvt")
	public void bTest3()
	{
		System.out.println("bTest3");		
	}

}
