package PomFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Marketplace {
	@FindBy(xpath="//span[text()='Marketplace']")
	private WebElement place;
	
	@FindBy(xpath="//span[text()='Inbox']")
	private WebElement inbox;
	
	
	public Marketplace(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void mark() {
		place.click();
	}
	
	public void in() {
		inbox.click();
	}

}
