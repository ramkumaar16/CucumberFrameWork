package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGRetryFailedDemo {
     public WebDriver driver;
	@Test(groups="smoke")
	@Parameters({"userName","passWord"})
	public void test1(String name,String password){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://auth.taskable.co:2100/");
	    driver.findElement(By.id("name")).sendKeys(name);
	    //takeSnap();
    	driver.findElement(By.id("password")).sendKeys(password+Keys.ENTER);
		System.out.println("I am Bad");
	}
}
	/*@Test(dependsOnMethods="test1")
	public void test2(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://auth.taskable.co:2100/");
	    driver.findElement(By.id("name")).sendKeys("ram6@yahoo.com");
	    //takeSnap();
    	driver.findElement(By.id("password")).sendKeys("11111111"+Keys.ENTER);
		System.out.println("I am Good");
		//int i = 1/0;
	}
	
	@Test
	public void test3(){
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://auth.taskable.co:2100/");
	    driver.findElement(By.id("name")).sendKeys("mr@local.com");
	    //takeSnap();
    	driver.findElement(By.id("password")).sendKeys("11111111"+Keys.ENTER);
		System.out.println("I am Good");
		//int i = 1/0;
		System.out.println("I am Joker");
		//Assert.assertTrue(2>1);
	}
	
	
	
}
*/