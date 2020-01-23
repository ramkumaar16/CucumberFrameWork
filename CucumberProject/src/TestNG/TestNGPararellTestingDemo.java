package TestNG;



import org.testng.annotations.Test;

public class TestNGPararellTestingDemo {
	//WebDriver driver = null;
	@Test
	public void test1(){
		
    	
		System.out.println("i am Good |"+Thread.currentThread().getId());
	}
	@Test
	public void test2(){
		
	    //takeSnap();
    	//driver.findElement(By.id("password")).sendKeys("11111111"+Keys.ENTER);
		System.out.println("i am Bad |"+Thread.currentThread().getId());
	}
}
