package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	// PageElements
@FindBy(xpath = "//button[text()='Checkout']")
private WebElement Checkout;
	
	//PageActions
public AddressPage CheckOut() {
	click(Checkout);
	return new AddressPage(driver);
}

	}

