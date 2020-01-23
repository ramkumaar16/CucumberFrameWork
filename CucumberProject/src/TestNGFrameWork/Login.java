package TestNGFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;


public class Login {
	
	
	public WebDriver driver;
    @BeforeTest
	public void loginpage(){
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://auth.taskable.co:2100/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("name")).sendKeys("ram6@yahoo.com");
    	driver.findElement(By.id("password")).sendKeys("11111111"+Keys.ENTER);
    	System.out.println("Driver's value1" + driver);
    	String title = driver.getTitle();
    	//boolean title1 = true;
    	SoftAssert ts = new SoftAssert();
    	ts.assertEquals("tazk", title);
    	//Assert.assertEquals("Taask", title1);
    	//Verify.verify(expression, errorMessageTemplate, p1, p2, p3);

	}
	
    @AfterTest
    public void close(){
    	driver.close();
    }

}
