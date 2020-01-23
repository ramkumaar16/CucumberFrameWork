package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumRC {
	
	 public static void main(String[] args) throws MalformedURLException {
		
			
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			
			ChromeOptions co = new ChromeOptions();
			co.merge(dc);
			
			String huburl = "http://192.168.1.26:4444/wd/hub";
			WebDriver driver = new RemoteWebDriver(new URL(huburl),co);
			
			driver.get("https://www.flipkart.com/account/login");
			
			System.out.println(driver.getTitle());
	}

}
