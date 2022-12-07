package PomFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class custumList {
	//https://www.facebook.com/friends/friendlist
	@FindBy(xpath="//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x676frb x1lkfr7t x1lbecb7 xk50ysn x1qq9wsj x1yc453h']")
	private WebElement list;
	
	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement cancl;
	
	public  custumList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void list() {
		list.click();
	}
	
	public void can() {
		cancl.click();
	}

}
