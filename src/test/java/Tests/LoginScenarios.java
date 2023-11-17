package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

public class LoginScenarios {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("Webdriver.chrome.driver", "./chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	public LoginPage invalidCredentials1() {
		new LoginPage(driver).enterUserName("tyty");
		new LoginPage(driver).enterPassword("secret_sauce");
		new LoginPage(driver).clickLogin();
		String actual = new LoginPage(driver).errorButt();
		Assert.assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		return new LoginPage(driver);
		
	}
	@Test(enabled = false)
	public void invalidCredentials2() {
		
	}
	public void invalidCredentials3() {
		
	}
	@Test(priority=1)
	public ProductsPage validCredentials() {
		new LoginPage(driver).enterUserName("standard_user");
		new LoginPage(driver).enterPassword("secret_sauce");
		new LoginPage(driver).clickLogin();
//		String actual = new LoginPage(driver).errorButt();
//		Assert.assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		return new ProductsPage(driver);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
