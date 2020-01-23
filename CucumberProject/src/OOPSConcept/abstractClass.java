package OOPSConcept;


abstract class animal{
	
 abstract void animalsound();
	
	public void runner(){
		
		System.out.println("Ramkumar");

}
	
}

 class pig extends animal{
	
	 void animalsound(){
		
		
		System.out.println("who is UR:");
	}
	
 }
public class abstractClass {

	public static void main(String[] args) {
		
		animal ts = new pig();
		ts.animalsound();
		ts.runner();
	}

}
