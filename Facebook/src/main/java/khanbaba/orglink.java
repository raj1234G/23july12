package khanbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orglink {
	
	@FindBy(xpath="//*[@id=\"login-or-signup\"]")
	private WebElement link;
	
	public orglink(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void linkk() {
		link.click();
	}

}
