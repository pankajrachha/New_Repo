package testPackage;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases2 {
	
	
   @Test(priority=-1)
	public void dummy()
	{
		System.out.println("-1 Negative priority");
		
	}
   
   @Test(priority=-2)
	public void dummy2()
	{
		System.out.println("-2 Negative priority");
	}
   

   
//	@Parameters({"URL"})
//	@Test
//	public void testCase(String urlVal)
//	{
//		System.out.println("***************************************");
//		System.out.println("Newly created Testcases2 executed");
//		System.out.println(urlVal);
//		System.out.println("***************************************");
//	}
	
	@Test(priority=1)
	public void testCase10()
	{
		System.out.println(" priority 1 executed");
	}
	
	@Test(priority=0)
	public void testCase2()
	{
		System.out.println("0 priority  executed");
	}

}
