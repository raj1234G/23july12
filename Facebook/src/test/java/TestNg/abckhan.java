package TestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Utils.Utility;
import Utils.Utility1;
import khanbaba.Logout;
import khanbaba.Profile;
import khanbaba.login;
import khanbaba.what;

public class abckhan {
	
	 WebDriver driver;
	 login nn;
	 Profile mm ;
	 SoftAssert Assert;
	 what jj;
	 Logout cc;
	 int testID;
	@BeforeClass
	public void beforeclass() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
 	driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeMethod
	public void beforemethod() throws EncryptedDocumentException, IOException {
		
	nn = new login(driver);
 	nn.linkennn();
 	nn.email();
 	nn.password();
 	nn.loginn();
 	
 	
	}
	@Test(priority=1)
	public void test() {
		testID=123;
	 mm = new Profile(driver);
	mm.profilee();
	
	
	String url = driver.getCurrentUrl();
	
	 Assert = new SoftAssert();
	 Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/");
	 Assert.assertAll();
	
	
	mm.learn();
    
	}
	@Test(priority=2)
	public void test1() {
		testID=1234;
	 jj = new what(driver);
	jj.whatt();
	
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://www.khanacademy.org/computing/computer-programming/programming/intro-to-programming/v/programming-intr");
	Assert.assertAll();
	

	}
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
		Utility.captureScreenshot(driver, testID);
		}
	 cc = new Logout (driver);
	cc.pp();
	cc.log();
	}
	@AfterClass
	public void afterclass() {
	
	driver.close();

}
}