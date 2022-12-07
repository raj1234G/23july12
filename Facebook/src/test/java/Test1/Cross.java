package Test1;


	
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
    import org.testng.annotations.Test;

	import PomFb.Friendss;

	import PomFb.LoginFb;
	import PomFb.Logout;
	import PomFb.Marketplace;
	import PomFb.custumList;

	public class Cross {
		
		 
	
		 WebDriver driver;
		 LoginFb l;
		 Friendss ff;
		 custumList  cc;
		 Marketplace nn ;
		 Logout k;
		 ChromeOptions  options;
		 
         @Parameters("browser")
		 
		 
		 
		 @BeforeTest
		 public void openBrowser(String browsername) {
			 System.out.println(browsername);
			 
			 if(browsername.equals("Chrome")) {
				 
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
				   driver = new ChromeDriver();
				   ChromeOptions  options = new ChromeOptions();
		   			options.addArguments("disable-notifications");
				   
			 }
			 
			 if(browsername.equals("Firefox")) {
				 System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
				    driver = new FirefoxDriver();
				   FirefoxOptions options = new FirefoxOptions();
		   			options.addArguments("disable-notifications");
			 }
                
   		   
   			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   			
   		 	driver.get("https://www.facebook.com/login.php");
		 }
		 
		 
		 
		@BeforeClass
		    public void fb() {  // all object place
			 l = new LoginFb(driver) ;
			 ff = new Friendss(driver); 
			 nn = new Marketplace(driver);
			 cc = new custumList (driver);
			 k = new Logout(driver);
			
		}
		@BeforeMethod
		    public void beforemethod() {
		 
		 	l.user();
		 	l.password();
		 	l.login();
		 	
		 	
		}
		
		
		
		@Test 
		
		public void test1() { 
			
		 	
			System.out.println("Test1 is running");
		 	
		 	ff.friends();
		 	ff.custum();
		 	
		 	String url = driver.getCurrentUrl();
		 	
		 	boolean result = url.equals("https://www.facebook.com/friends");
		 	Assert.assertEquals(url, "https://www.facebook.com/friends");
		 }
		
		@Test
		
		public void test2() {
			System.out.println("Test2 is running");
			nn.mark();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://www.facebook.com/marketplace/?ref=bookmark");
			nn.in();
		}
		
		@Test
		
		public void test3() {
			cc.list();
		 	String url = driver.getCurrentUrl();
		 	Assert.assertEquals(url, "https://www.facebook.com/friends/friendlist");
		    cc.can();
		}
		
		
	 
	       
	      @AfterMethod()
		
			public void aftermethod() {
	    		k.outt();
			 	k.out();
		 	
		}
		 
		
		@AfterClass
		public void afterclass() {  // null all object variables
			
			 l = null;
			 ff = null;
			 nn = null;
			 cc = null;
			 k = null;
		 
			
		}
		
		@AfterTest
		
		public void aftertest() {   // browser quit and System.gc method
			
		
			driver.quit();
			System.gc();
		 		
		 	
		}




}
