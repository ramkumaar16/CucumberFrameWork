package OOPSConcept;

import java.util.HashMap;
import java.util.Scanner;

interface name{
	
	public void myname();
	public void myschool();
	
}

class info implements name{
  
	public void myname(){
		System.out.println("ramkumar");
	}
    
	public void myschool(){
		System.out.println("Psg Clg");
	}
    
}
public class iterface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*name ts =new info();
		ts.myname();
		ts.myschool();
        
		String str ="BABYavcab";
		int cnt = 0;
		char[] inp = str.toCharArray();
		for(int i =0;i<str.length();i++){
			
			for(int j= i+1;j<str.length();j++){
				
				if(inp[i]==inp[j]){
					System.out.print("DUPLICATES ARE:"+inp[j]);
					cnt++;
					break;
				}
			}
			*/
	
	   String str ="raja cholan raja rajenderan";
	   String limit[] = str.split(" ");
	   int length = limit.length;
	   StringBuilder ts = new StringBuilder();
	   for(int i =limit.length;i>0;i--){
		   ts.append(" "+limit[i-1]);
		   if(i==1)
		   System.out.println(""+ts);
	   }
			
		
		

	}
	
}













