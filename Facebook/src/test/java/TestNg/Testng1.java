package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {

	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass is running");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		
		System.out.println("beforemethod is running");
	}
	
	@Test
	
	public void test() {
		System.out.println("test class is running");
	}
}
