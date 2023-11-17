package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage{

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	public ProductsPage(WebDriver driver){
//		PageFactory.initElements(driver, this);
		super(driver);
		this.driver = driver;
		
	}
	
//PAGE ELEMENTS
		@FindBy(xpath ="//button[text() = 'Add to cart']")
		private List<WebElement>addToCart;
		@FindBy(xpath ="//div[text() = 'Sauce Labs Backpack']")
		private WebElement backPack;
		


//PAGE ACTIONS 1. VALIDATE THE NUMBER OF PRODUCTS  2.CHOOSE ONE PRODUCT
public void validateProducts() {
	
}
public ProductsDetailPage chooseOneProduct() {
	click(backPack);
	return new ProductsDetailPage(driver);
}

}
	




