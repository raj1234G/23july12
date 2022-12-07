package khanbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(xpath="//span[text()='pooja waghmare']")
	
	private WebElement gout;
	
	@FindBy(xpath="//span[text()='Log out']")
	
	private WebElement out;
	
	public Logout(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void pp() {
		
		gout.click();
	}
	
	public void log () {
		
		out.click();
	}
	
	
	
}






