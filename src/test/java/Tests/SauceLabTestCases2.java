package Tests;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddressPage;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.CompletePage;
import Pages.LoginPage;
import Pages.ProductsDetailPage;
import Pages.ProductsPage;

public class SauceLabTestCases2 {
	
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("Webdriver.chrome.driver", "./chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test( description = "This is end to end purchase", priority = 1, timeOut=3000, invocationCount=3)
public void validCredentials() {
		new LoginPage(driver).enterUserName("standard_user");
		new LoginPage(driver).enterPassword("secret_sauce");
		new LoginPage(driver).clickLogin();
		new ProductsPage(driver).chooseOneProduct();
		new ProductsDetailPage(driver).ClickElement();
		new ProductsDetailPage(driver).clickCartPage();
		new CartPage(driver).CheckOut();
		new AddressPage(driver).enterDetails("Aparna Sasi", "Sabb", "L7A0Y2");
		new CheckoutPage(driver).checkout();
		//Assertion
		String actual = new CompletePage(driver).ValidateLastMessage();
		Assert.assertEquals(actual,"Thank you for your order!");
		
	}
		
		
		
//Test case 2
	@Test(enabled = true)
public void a() {
		System.out.println("This is a test");
	
}
	@Test(enabled = false)
	public void b() {
		System.out.println("This is another test");
	
}
	@Test(enabled = false)
	public void c() {
		System.out.println("This is a diffferent test");
	
}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
