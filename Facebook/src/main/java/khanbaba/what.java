package khanbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//https://www.khanacademy.org/computing/computer-programming/programming
public class what {
	
	
	@FindBy(xpath="(//span[@class='_14hvi6g8'])[1]")  // what is programming
	private WebElement what;
	
	public what(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void whatt() {
		what.click();
	}

}

