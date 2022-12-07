package PomFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFb {
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement login;
	
	public  LoginFb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void user() {
		username.sendKeys("9420662974");
	}
	
	public void password() {
		password.sendKeys("Raj$454");
	}
	
	public void login() {
		login.click();
	}

}
