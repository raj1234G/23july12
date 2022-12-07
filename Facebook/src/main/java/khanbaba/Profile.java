package khanbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	
	
	@FindBy(xpath="//span[text()='Profile']") // profile//  https://www.khanacademy.org/profile/me/courses
	private WebElement profile;
	
	@FindBy(xpath="(//a[@role='button'])[1]")  // learn programming
	private WebElement button;
	
	
	public Profile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void profilee() {
		profile.click();
	}
	
	public void learn() {
		button.click();
	}

}
