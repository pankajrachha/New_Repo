package testPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases {
	
	@DataProvider(name="getData")
    public Object[][] loginDataProvider()
    {
        return data;
    }
    Object[][] data= 
    {
            {"John","23"},
            {"Sanjana","40"},
            {"Deepa","01"}

    };
       
	@Test(priority=1, dataProvider="getData")
	public void testCase1(String name, String rollno)
	{
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollno);
		System.out.println("Testcase 1 executed");
	}
	
	@Test(priority=2)
	public void testCase2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pankaj\\Chrome Driver Downloads\\chromedriver-win64\\chromedriver.exe");
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/auth/login");
		driver.manage().window().maximize();
		System.out.println("Testcase 2 executed");
		throw new SkipException("message");
	}
	
	@Test(priority=3,dependsOnMethods = {"testCase2"})
	public void testCase3()
	{
		System.out.println("Testcase 3 executed");
		throw new SkipException("message");
	}
	
	@Test(priority=5)
	public void testCase4()
	{
		System.out.println("Testcase 4 executed");
		
	}
	
	@Test(priority=2)
	public void testCase5()
	{
		System.out.println("Testcase 5 executed");
		Assert.assertTrue(false);
	}
	
	@Test(priority=6)
	public void testCase6()
	{
		System.out.println("Testcase 6 executed");
		Assert.assertTrue(false);
	}
	
	@Test(priority=7)
	public void testCase7()
	{
		System.out.println("Testcase 7 executed");
		Assert.assertTrue(false);
	}
	
	@Test(priority=8)
	public void testCase8()
	{
		System.out.println("Testcase 8 executed");
		Assert.assertTrue(false);
	}
	
	@Parameters({"URL"})
	@Test(priority=9)
	public void testCase9(String urlVal)
	{
		System.out.println("***************************************");
		System.out.println("Testcase 9 executed");
		System.out.println(urlVal);
		System.out.println("***************************************");
	}
	
	@Test(priority=10)
	public void testCase10()
	{
		System.out.println("Testcase 10 executed");
	}
	
}
