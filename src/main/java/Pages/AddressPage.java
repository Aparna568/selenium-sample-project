package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {

public AddressPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//page element section 
		
		
	@FindBy(id = "first-name")
	private WebElement firstName;
	@FindBy(id = "last-name")
	private WebElement lastName;
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	@FindBy(id = "continue")
	private WebElement continueNext;

	
	
//Page actions section
	
	public CheckoutPage enterDetails(String fName, String lName, String zipCode) {
		enterText(firstName, fName);
		enterText(lastName, lName);
		enterText(postalCode, zipCode);
		click(continueNext);
		return new CheckoutPage(driver);
		
	}

	
	
	
		
	}


