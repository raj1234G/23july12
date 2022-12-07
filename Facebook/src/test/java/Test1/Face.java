package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomFb.Friendss;

import PomFb.LoginFb;
import PomFb.Logout;
import PomFb.Marketplace;
import PomFb.custumList;

public class Face {
	
	 WebDriver driver;
	 LoginFb l;
	 Friendss ff;
	 custumList  cc;
	 Marketplace nn ;
	 Logout k;
	 
	@BeforeClass
	    public void fb() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
	    driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	 	driver.get("https://www.facebook.com/login.php");
	
	}
	@BeforeMethod
	    public void beforemethod() {
	  l = new LoginFb(driver) ;
	 	l.user();
	 	l.password();
	 	l.login();
	}
	
	
	
	@Test 
	
	public void test1() { 
		
	 	
	  ff = new Friendss(driver); 
	 	
	 	ff.friends();
	 	ff.custum();
	 	
	 	String url = driver.getCurrentUrl();
	 	
	 	boolean result = url.equals("https://www.facebook.com/friends");
	 	Assert.assertEquals(url, "https://www.facebook.com/friends");
	 }
	
	
       
      @AfterMethod()
	
		public void aftermethod() {
	 	cc = new custumList (driver);
	 	cc.list();
	 	String url = driver.getCurrentUrl();
	 	Assert.assertEquals(url, "https://www.facebook.com/friends/friendlist");
	    cc.can();
	}
	 
	
	@AfterClass
	public void afterclass() {
		 k = new Logout(driver);
	 	k.outt();
	 	k.out();
	 
		driver.quit();
	}
	
	 	
	 		
	 	
	}


