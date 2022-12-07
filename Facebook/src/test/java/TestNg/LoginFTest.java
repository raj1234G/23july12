package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFTest {
	
	WebDriver driver;
	
	@Test
	
	public void test() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
		 	driver.get("https://www.khanacademy.org/");
	}
	
	@Test
	
	public void test2() {
		
		WebElement User = driver.findElement(By.xpath("//input[@class='_1azps1NaN'])[1]"));
		User.sendKeys("");
	}

}
