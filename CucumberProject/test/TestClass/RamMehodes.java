package TestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


 public class RamMehodes {
		
	   public static WebDriver driver ;
	   public static String surl;
       public static String sbrowser;
	   public Properties prop;
	   
public 	RamMehodes(){
	
		    prop = new Properties();
			try {
				prop.load(new FileInputStream(new File("C:\\Users\\Dev\\git\\CucumberFrameWork\\CucumberProject\\test\\Config\\Properties\\config.Properties")));
				surl=prop.getProperty("URL");
				sbrowser=prop.getProperty("BROWSER");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( "Driver" + driver);
				
}	
	

	public static void startapp() {
		
	if(sbrowser.equalsIgnoreCase("CHROME")){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();	
	}
	if(sbrowser.equalsIgnoreCase("FIREFOX")){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(surl);
    
	}
}

 
	



