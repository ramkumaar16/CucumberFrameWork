package TestNG;

import org.testng.annotations.Test;

@Test(groups={"allclass"})
public class TestNGGroupsDemo {
	
	
	@Test(groups={"sanity"})
	public void test1(){
		System.out.println("I am good");
	}
	@Test(groups={"sanity","smoke"})
	public void test2(){
		System.out.println("I am Bad");
	}
	
	@Test(groups={"sanity","regression"})
	public void test3(){
		System.out.println("I am Joker");
	}
	@Test
	public void test4(){
		System.out.println("I am mad");
	}

}
