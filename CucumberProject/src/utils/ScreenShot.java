package utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScreenShot {
/*
	public static RemoteWebDriver driver;
	public static long takeSnap(){
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}*/
	
	
	
	public static void main(String[] args) {
	}
}
		// TODO Auto-generated method stub
		//takeSnap();
		
		/*String str,rev="";
		System.out.println("Enter Values:");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
        int length = str.length();
        for(int i =length-1 ;i>=0;i--){
        	rev = rev+str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
        	System.out.println("its a palindrome");
        }
        else{
        	System.out.println("Its not Palindrome");
        }*/
		
		
		