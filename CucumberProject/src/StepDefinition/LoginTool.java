package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ScreenShot;
public class LoginTool extends ScreenShot {
	
WebDriver driver ;
	
    @Given("^Given Launch browser$")
    public void launchBrowser(){
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://auth.taskable.co:2100/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("name")).sendKeys("");
	   // takeSnap();
    	driver.findElement(By.id("password")).sendKeys(""+Keys.ENTER);
    	//driver.findElement(By.xpath("//form[@id='login-frm']")).click();
    }
    @When("^Create Project in Dev$")
    public void createProject() throws InterruptedException{
    	Thread.sleep(5000);
    	driver.findElement(By.id("addproject")).click();
    	driver.findElement(By.id("projectname")).sendKeys(Keys.SHIFT,"Pass Mass1");
    	Thread.sleep(1000);
    	driver.findElement(By.id("createproject")).click();	
    	//takeSnap();
    	
    }
	@Then("^Create Sprint in Dev$")
    public void createSprint(){
    	driver.findElement(By.xpath("(//button[@class='btn success-btn'])[1]")).click();
    	driver.findElement(By.xpath("//input[@name='Sprint Name']")).sendKeys("New Man");
    	driver.findElement(By.id("startdate-input")).sendKeys("1/8/2020");
    	driver.findElement(By.id("enddate-input")).sendKeys("1/9/2020");
    	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    	//takeSnap();
	}	
	
   @And("^Create \"([^\"]*)\" in Dev$") 
   public void taskCreate(String arg3) throws InterruptedException, IOException{
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//div[@class='progress-block']v )[8]")).click();
	   driver.findElement(By.id("addtask")).sendKeys(arg3+Keys.TAB);   
	   
	   TakesScreenshot sc =  (TakesScreenshot)driver;
	   File str = sc.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(str, new File(""));
	   
   }	
}

