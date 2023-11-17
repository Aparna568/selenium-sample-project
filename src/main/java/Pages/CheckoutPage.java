package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
@FindBy(id = "finish")
private WebElement Finish;
	
public CompletePage checkout()
{
	click(Finish);
	return new CompletePage(driver);
}
}
