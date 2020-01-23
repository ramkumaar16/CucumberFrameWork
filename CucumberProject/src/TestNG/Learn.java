package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

class teacher{
	
	teacher(){
		
		int i = 1;
		System.out.println("I am Teacher of 8th STD:"+i);
		
	}
	
}
 class students extends teacher{
	 
	  students() {
		  super();
		  System.out.println("Here have 50 studets in the class");
	}
	 
 }
public class Learn  {
	
	public static void main(String[] args) {
		
		students ts = new students();
	    	
		
		
		
		
		
		
		
	}

	private static void students() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
/*
	SoftAssert soft_assert=new SoftAssert();  
	@Test  
	public void Soft_Assert()  
	{  
	 soft_assert.assertTrue(true);  
	 System.out.println("soft assertion");  
	}  
	@Test  
	public void Hard_Assert()  
	{  
	 Assert.assertTrue(true);  
	 System.out.println("hard assertion");  
	}  	*/
	
	
}
