package KhanAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import khanbaba.Logout;
import khanbaba.Profile;
import khanbaba.login;
import khanbaba.what;

public class Cbrow {
	
	 WebDriver driver;
	 login nn;
	 Profile mm ;
	 SoftAssert Assert;
	 what jj;
	 Logout cc;
	 SoftAssert soft;
	 
	 @Parameters("browser")
	 
	 @BeforeTest
	 public void openbrowser(String browsername) {
		 
		 System.out.println(browsername);
		 
		 if(browsername.equals("Chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();}
		 if(browsername.equals("Firefox")) {
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
		 }
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
		 	driver.get("https://www.khanacademy.org/");
	 }
	 
	@BeforeClass
	public void beforeclass() {
		nn = new login(driver);
		mm = new Profile(driver);
		 jj = new what(driver);
		 cc = new Logout (driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		
 	 
 	nn.linkennn();
 	nn.email();
 	nn.password();
 	nn.loginn();
 	soft = new SoftAssert();
 	
	}
	
	@Test(priority=1)
	public void test1() {
	System.out.println("Test1 is running");
   
	mm.profilee();
	
	String url = driver.getCurrentUrl();
	 soft = new SoftAssert();
	 soft.assertEquals(url, "https://www.khanacademy.org/profile/me/");
	 soft.assertAll();
	 mm.learn();
    
	}
	
	@Test(priority=2)
	public void test2()     {
		
    System.out.println("Test2 is Running");
    
	jj.whatt();
	
	String url = driver.getCurrentUrl();
	soft = new SoftAssert();
	soft.assertEquals(url, "https://www.khanacademy.org/computing/computer-programming/programming/intro-to-programming/v/programming-intro");
	soft.assertAll();
	
	}
	@AfterMethod
	public void aftermethod() {
	 
	cc.pp();
	cc.log();
	}
	@AfterClass
	public void afterclass() {
	
		nn=null;    // null all pom class object
		mm=null;
		jj=null;
		cc=null;
	}
		
		@AfterTest
		public void afterTest() {
			
	     driver.close();
	    System.gc(); 
		}

}





