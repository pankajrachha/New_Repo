package testPackage;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ConfigFileReader;
import pageObjects.LoginPage;

public class LoginTestCase extends ConfigFileReader {
	
	ConfigFileReader configFileReader= new ConfigFileReader();
	WebDriver driver;
	LoginPage obj = new LoginPage(driver);
	
	@DataProvider(name="getData")
    public Object[][] loginDataProvider()
    {
	    return new Object[][] 
	    {
	        {"pankaj.rachha111@gmail.com","Pankaj@1#"}
	    };
        
    }
	@Test
	public void launchHomePage()
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="getData")
	public void login(String username, String password)
	{
		driver.findElement(By.id(configFileReader.getUserName())).sendKeys(username);
		driver.findElement(By.id(obj.password())).sendKeys(password);
		driver.findElement(By.id(obj.login())).click();
	}
	
//	public WebElement getUsername()
//	{
//		wait.until(ExpectedConditions.visibilityOf(usernameField));
//		return usernameField;		
//	}
//	
//	public WebElement getPassword()
//	{
//		wait.until(ExpectedConditions.visibilityOf(passwordField));
//		return passwordField;		
//	}
//	
//	public WebElement login()
//	{
//		wait.until(ExpectedConditions.visibilityOf(loginField));
//		return loginField;		
//	}
//	
//	public WebElement getErrorText()
//	{
//		wait.until(ExpectedConditions.visibilityOf(errorMessage));
//		return errorMessage;		
//	}
//	
//	
//	public WebElement successMessage()
//	{
//		wait.until(ExpectedConditions.visibilityOf(loginSuccess));
//		return loginSuccess;		
//	}

}
