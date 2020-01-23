package OOPSConcept;

class fuction{
	
	private String nameofemp = "ramkumar";
	private int hisAge = 23;
	private int hisroll = 1130;
	
	public String std(){
		return nameofemp;
	}
	
	public int age(){
		return hisAge;
		
	}
	
	public int roll(){
		return hisroll;
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fuction ts = new fuction();
		System.out.println("Employee Name:"+ts.std());
		System.out.println("Age:"+ts.age());
		System.out.println("Roll:"+ts.roll());
		

	}

}
