package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import KhanAcademy.pas;

public class DdDrop {
	
	@Test
	
	public void test() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
		 	driver.get("https://www.khanacademy.org/");
		 	
		 	WebElement log = driver.findElement(By.xpath("//a[@id='login-or-signup']"));
		 	log.click();
		   
	//	 	WebDriverWait g = new  WebDriverWait(driver,Duration.ofSeconds (3)); 
//			WebElement m = g.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_1azps1NaN'])[1]")));
		// 	m.sendKeys("poojawaghmare262000@gmail.com");
		// 	String n = pas.demo();
		 	WebElement k = driver.findElement(By.xpath("//input[@type='password']"));
		 	//k.sendKeys(n);
		 	
	//	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

}
