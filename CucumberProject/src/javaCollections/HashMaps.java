package javaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class student{
	String name;
	int age;
	int roll;
	
	student(String name,int age,int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;	
	}	
}

public class HashMaps {

	public static void main(String[] args) {
		
		
		int n = 5; 
		  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion   
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*HashMap<Integer, String>  sc = new HashMap<Integer, String>();
		sc.put(100, "kamal");
		sc.put(101,"VICKY");
		sc.put(102, "RAM");
		sc.put(103, "jeeva");
		
		Set<Entry<Integer, String>> set = sc.entrySet();
		Iterator<Entry<Integer, String>> i = set.iterator();
		System.out.print(sc);*/
		
		/*ArrayList<String> al = new ArrayList<>();
		al.add("ram");
		al.add("kumar");
		al.add("raja");
		al.add("mani");
		for(Object obj:al){
			
			System.out.println(obj);
		}*/
		
		
	}
	
}
