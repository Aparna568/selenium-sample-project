package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage { //BasePage is the parent page, LoginPage is the childpage.

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public WebDriver driver;
	public  LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
//page element
		@FindBy(id = "user-name")
		private WebElement userName;
		@FindBy(id = "password")
		private WebElement password;
		@FindBy(id = "login-button")
		private WebElement login;
		@FindBy(xpath="//h3[@data-test='error']")
		private WebElement errBtn;
		//Page actions
		
		public LoginPage enterUserName(String UserName) {
//			new BasePage(driver).waitForElement(userName);
//			userName.sendKeys(UserName);
			enterText(userName, UserName);
			return this;
		}
			public LoginPage enterPassword(String PassWord) {
//			new BasePage(driver).waitForElement(password);
//			password.sendKeys(PassWord);
			enterText(password, PassWord);
			return this;
		}
			public ProductsPage clickLogin() {
			new BasePage(driver).waitForElement(login);
			login.click();
			return new ProductsPage(driver);
		}
			public String errorButt() {
				return getText(errBtn);
				
				
			}

}
