package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestNGFrameWork.AddProjectandSprint;

public class AddTask extends AddProjectandSprint {

	
    @Test
	public void addingTask() throws InterruptedException{

    	System.out.println(driver);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class='progress-block'])[4]")).click();
		for(int i=1;i<=10;i++)
		driver.findElement(By.id("addtask")).sendKeys("akaa"+i+Keys.TAB); 




	}

}
