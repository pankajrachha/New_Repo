package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ConfigFileReader;

public class LoginPage extends ConfigFileReader {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
//	WebDriverWait wait= new WebDriverWait(driver, 30);
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
//		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
//	public void navigateTo_HomePage() {
//		driver.get(configFileReader.getApplicationUrl());
//		driver.manage().window().maximize();
//	}
		
	public String userName() {
		return configFileReader.getUserName();
	}
	
	public String password() {
		return configFileReader.getPassword();
	}
	
	public String login() {
		return configFileReader.getLogin();
	}
	
//	public String HomePageLogOut() {
//		return configFileReader.lo
//	}
	
	
//	@FindBy(id = "userEmail")
//	 private WebElement usernameField;
//	
//	@FindBy(id = "userPassword")
//	 private WebElement passwordField;
//	
//	@FindBy(id = "login")
//	 private WebElement loginField;
//	
//	@FindBy(id = "toast-container")
//	 private WebElement errorMessage;
//	
////	aria-label="Login Successfully"
//			
//	@FindBy(css="[aria-label='Login Successfully']")
//	 private WebElement loginSuccess;
//	
//	
//	@FindBy(css=".logo-holder.logo-7")
//	 private WebElement logoHomePage;
	
		
//	public WebElement getHomePageLogo()
//	{
//		wait.until(ExpectedConditions.visibilityOf(logoHomePage));
//		return logoHomePage;		
//	}
//	
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
