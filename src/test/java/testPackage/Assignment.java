package testPackage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;


public class Assignment {
	
	public WebDriver driver;
	LoginPage obj;
	public WebDriverWait wait;
	
	
	public Logger log=LogManager.getLogger(Assignment.class);
		
		@DataProvider(name="getData")
	    public Object[][] loginDataProvider()
	    {
		    return new Object[][] 
		    {
		        {"pankaj.rachha111@gmail.com","Pankaj@1#"}
		    };
	        
	    }

		/* Opening the browser */
		@BeforeSuite
		public void OpenBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Pankaj\\Chrome Driver Downloads\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://rahulshettyacademy.com/client");
			driver.manage().window().maximize();
			System.out.println("OpenBrowser executed");
			log.info("OpenBrowser executed");
			obj= new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
	    /* Executing the Sign In Testcase*/
		@Test(priority=1, dataProvider="getData")
		public void SignIn(String uname, String password) throws Exception
		{	
			System.out.println("*********Executing SignIn**********************");
			obj.getUsername().sendKeys(uname);
			obj.getPassword().sendKeys(password);
			obj.login().click();
			
			
			if(obj.getHomePageLogo().isDisplayed())
			{
				System.out.println("Sign In executed");
				log.info("Sign In executed");				
			}
			else
			{	
				System.out.println("Sign In Failed");
				log.error("Sign In failed");
				Assert.assertTrue(false);
			}

		}
		
		/* Executing the Landing Testcase*/
		@Test(priority=2,dependsOnMethods = {"SignIn"})
		public void LandingPage()
		{
			if(driver.getTitle().equalsIgnoreCase("Let's Shop"))
			{
				System.out.println("Successfully launched the landing page");
				System.out.println("Page Title="+driver.getTitle());
				System.out.println("Landing Page executed");
				log.info("Launched Landing Page");
			}
			else
			{
				System.out.println("Landing Page not launched");
				log.info("Failed launching Landing Page");
			}
			
		}
		
		/* Executing the TearDown*/
		@AfterSuite
		public void TearDown()
		{
			driver.quit();
			System.out.println("Tear Down");	
			log.info("Tear Down");
		}
		


}
