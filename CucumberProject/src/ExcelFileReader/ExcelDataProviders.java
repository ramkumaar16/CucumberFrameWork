package ExcelFileReader;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviders {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest(){
		String projectpat = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpat+"./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	 
	@Test(dataProvider="test1data")
	public void test1(String UserName,String PassWord){
		
		System.out.println(UserName+"|"+PassWord);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://auth.taskable.co:2100/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("name")).sendKeys(UserName);
	   // takeSnap();
    	driver.findElement(By.id("password")).sendKeys(PassWord+Keys.ENTER);
    	
    	//Drag and Drop
    	Actions act = new Actions(driver);
    	driver.switchTo().frame("");
    	WebElement drag = driver.findElement(By.id(""));
    	WebElement drop = driver.findElement(By.id(""));
    	act.dragAndDrop(drag, drop).perform();
		
	}
	
	
	@DataProvider(name = "test1data")
	public static Object[][] getData(){
		String excelPath = "E://TESTING//CucumberProject//excel//data1.xlsx";
		Object data[][] = testDate(excelPath,"Sheet1");
		return data;
	}
	

	public static Object[][] testDate(String excelPath, String sheetName){
		
		 	
	   ExcelUtilsFile excel = new ExcelUtilsFile(excelPath, sheetName);
	   int rowCount = excel.getRowCount();
	   int colCount = excel.getcolCount();
		
	   Object data[][] = new Object[rowCount-1][colCount];
	   
	   
	   for(int i =1;i<rowCount;i++){
		   for(int j=0;j<colCount;j++){
			  
			String CellDate =   excel.getCelldataString(i, j);
			System.out.println(CellDate);
			data[i-1][j]=CellDate;
		   }
		 
	   }
	return data;
	   
	   
	}

}
