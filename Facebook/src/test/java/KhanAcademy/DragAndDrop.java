package KhanAcademy;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import khanbaba.login;

public class DragAndDrop {
	
	@Test
	public void test1() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	 	driver.get("https://www.khanacademy.org/");
	 	
	 	WebElement log = driver.findElement(By.xpath("//a[@id='login-or-signup']"));
	 	log.click();
	 	

	
	 	
	 	
	 	//driver.findElement(By.xpath("(//input[@class='_1azps1NaN'])[1]")).sendKeys("poojawaghmare262000@gmail.com");
	 //	Thread.sleep(3000);
	 	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pujarohan160207");
	 	
	 	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	 	//Thread.sleep(3000);
	 	//driver.findElement(By.xpath("//span[@data-learn-menu-trigger='true']")).click();
	 	
	 	driver.findElement(By.xpath("//span[text()='Class 1']")).click();
	 	
	 	driver.findElement(By.xpath("//a[@role='button']")).click();
	 	
	 //	WebElement title = driver.findElement(By.xpath("(//a[@class='_dwmetq'])[8]"));
	 	
	 //	JavascriptExecutor ac =(JavascriptExecutor)driver;
	 //	ac.executeScript("arguments [0].scrollIntoView(true)", title);
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	 	
	 	WebElement source = driver.findElement(By.xpath("(//div[@class='card-wrap perseus-interactive'])[1]"));
	 	WebElement desti = driver.findElement(By.xpath("//div[@class='perseus-clearfix draggable-box']"));
	 Actions apple = new Actions(driver);
	 	for(int i=0; i<5; i++) {
	 		Thread.sleep(3000);
	 		apple.dragAndDrop(source, desti).build().perform();
	 	}
	} 	

}
