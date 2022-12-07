package khanbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {//https://www.khanacademy.org/login
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement linkk;
	
	
	@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement buttn;
	
	
	
	
	public login (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void linkennn() {
		linkk.click();
	}
	
	public void email() {
		user.sendKeys("poojawaghmare262000@gmail.com"); //raj1234G  //poojawaghmare262000@gmail.com   //Aniket2646
		
		
	}
	
	public void password() {
		pass.sendKeys("pujarohan160207");  //raj12345  //pujarohan160207  //Aniket@123
	}
	public void loginn() {
		buttn.click();
	}
		
	
}
