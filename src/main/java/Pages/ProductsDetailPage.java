package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class ProductsDetailPage extends BasePage{

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//PAGEFACTORY
public WebDriver driver;
public ProductsDetailPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	}
@FindBy(xpath = "//button[text() = 'Add to cart']")
private WebElement element;
@FindBy(xpath = "//span[@class = 'shopping_cart_badge']")
private WebElement ShoppingCart;

public void ClickElement() {
	click(element);
}
public CartPage clickCartPage(){
	click(ShoppingCart);
	return new CartPage(driver);
}
}
