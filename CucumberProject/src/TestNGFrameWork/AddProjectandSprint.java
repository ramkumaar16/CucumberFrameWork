package TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

public class AddProjectandSprint extends Login  {
	
//	public static WebDriver driver ;
	@Test
	public void addProject() throws InterruptedException{
		try {
			Thread.sleep(10000);
	    	System.out.println("Driver value" + driver);
			driver.findElement(By.id("addproject")).click();
			driver.findElement(By.id("projectname")).sendKeys(Keys.SHIFT,"li1feqr1");
			Thread.sleep(1000);
			driver.findElement(By.id("createproject")).click();
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		}	
	}
    
	@Test
	public void addSprint() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='btn success-btn'])[1]")).click();
    	driver.findElement(By.xpath("//input[@name='Sprint Name']")).sendKeys("New1m ass1qq1");
    	driver.findElement(By.id("startdate-input")).sendKeys("1/24/2020");
    	driver.findElement(By.id("enddate-input")).sendKeys("1/25/2020");
    	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}
	
	@Test
	public void addTask() throws InterruptedException{
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("(//div[@class='progress-block'])[4]")).click();
		   for(int i=1;i<=10;i++)
		   driver.findElement(By.id("addtask")).sendKeys("ram"+i+Keys.TAB); 
	}
	
}
