package PomFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(xpath="(//span[@class='x4k7w5x x1h91t0o x1h9r5lt xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j x1jfb8zj'])[5]")
	private WebElement oUt;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void outt() {
		oUt.click();
	}
	
	public void out() {
		logout.click();
	}

}
//(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h'])[5]