package KhanAcademy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KhanAcDemy {
	
	
	
	public static void main(String[] args) throws InterruptedException { 
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		 	driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");
		 	
		 	
		 	WebElement listBox = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
		 	WebElement watchTitle = driver.findElement(By.xpath("(//h2[@class='section-title'])[3]"));
		 	
			JavascriptExecutor js =  (JavascriptExecutor)driver;
		    js.executeScript("arguments [0].scrollIntoView(true)",watchTitle);
		 	
	         Select select = new Select(listBox);
		     for(int i =0; i<7; i++) {
			
			select.selectByIndex(i);
			System.out.println("Available videos for class "+ (i+4));
			List<WebElement> videos = driver.findElements(By.xpath("//div[@class='row row-inline']//a"));
			if(videos.size()==2) {
				System.out.println("passed");
			}
			videos.get(0).click();
			driver.switchTo().frame(0);
			String videotitle = driver.findElement(By.xpath("//div[@class='ytp-title-text']")).getText();
			System.out.println(videotitle);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
			
			videos.get(1).click();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			videotitle = driver.findElement(By.xpath("//div[@class='ytp-title-text']")).getText();
			System.out.println(videotitle);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
		}
		 	
			}
	}


