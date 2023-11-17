package Pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
// COMMON METHODS
	public void click(WebElement e) {
		e.click();
	}
	// wait before clicking
	public void enterText(WebElement e, String text) {
		waitForElement(e);
		e.sendKeys(text);
	}
	public void waitForElement(WebElement e) {
		WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	public String getText(WebElement e) {
		waitForElement(e);
		return e.getText();
	}
	public void clickByJavaScript(WebElement e) {
		waitForElement(e);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e);
	}
	public void doubleClick(WebElement e) {
		Actions actions = new Actions(driver);
		waitForElement(e);
		actions.doubleClick().perform();
	}
	public void rightClick(WebElement e) {
		Actions actions = new Actions(driver);
		waitForElement(e);
		actions.contextClick().perform();
	}
	public void sendKeys(WebElement e, String txt) {
		waitForElement(e);
		e.clear();
		e.sendKeys();
		
	}
	public String getAttribute(WebElement e, String attribute) {
		waitForElement(e);
		return e.getAttribute(attribute);
	}
	public void switchToNextTab() {
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));		
	}
	public void switchToPreviousTab() {
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));		
	}
	public void scrollToElement(WebElement e) {
		waitForElement(e);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",e);
		}
	
}

