package PomFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Friendss {
	//https://www.facebook.com/
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement Friends;
	
	@FindBy(xpath="(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x676frb x1lkfr7t x1lbecb7 xk50ysn xzsf02u x1yc453h'])[6]")
	private WebElement custum;
	
	public  Friendss(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void friends() {
		Friends.click();
	}
	
	public void custum() {
		custum.click();
	}
	
	
	

}
