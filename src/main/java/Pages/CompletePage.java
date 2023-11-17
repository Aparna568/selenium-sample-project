package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{
	public WebDriver driver;
public CompletePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath = "//h2[text() = 'Thank you for your order!']")
      private WebElement OrderMessage;

public String ValidateLastMessage() {
	return getText(OrderMessage);
	
}


}
