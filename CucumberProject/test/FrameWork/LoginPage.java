package FrameWork;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import TestClass.RamMehodes;

public class LoginPage extends RamMehodes {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}	
	
@FindBy(how=How.ID,using="name")
private WebElement eleuserName;
public  LoginPage userName(){
	 
	eleuserName.sendKeys("ram6@yahoo.com");
	return this;
 		
}

@FindBy(how=How.ID,using="password")
private WebElement elepassword;
public  LoginPage passWord(){ 
	elepassword.sendKeys("11111111"+Keys.ENTER);
	return new HomePage();
 		
}






}
