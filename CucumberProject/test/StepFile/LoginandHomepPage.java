package StepFile;

import FrameWork.AddSPrintandTask;
import FrameWork.HomePage;
import FrameWork.LoginPage;
import TestClass.RamMehodes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginandHomepPage extends RamMehodes{
	
	//LoginPage ts = new LoginPage();
	HomePage ts1 = new HomePage();
	@Given("^Given Launch browsers$")
	public void launchBrowser(){
		RamMehodes.startapp();
		LoginPage	ts = new LoginPage();
		ts.userName();
		ts.passWord();
		
	}
	
	@When("^Create Project in Devs$")
	public void addProject() throws InterruptedException{
		
		 
		 ts1 = new HomePage();
		 ts1.createproject();
		 ts1.typename();
		 ts1.project();
		
	}
	@Then("^Create Sprint in Devs$")
	public void addsprint()throws InterruptedException{
		
		AddSPrintandTask st = new AddSPrintandTask();
		st.clicksprint();
		st.sprintname();
		st.select1stdate();
		st.selectlastdate();
		st.createsprint();
		st.sprintclick();
		st.addTask();
		
		
	}

}
