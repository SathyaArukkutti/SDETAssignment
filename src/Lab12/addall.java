package Lab12;

import java.util.LinkedList;
import java.util.List;

public class addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       List<Integer> list1 = new LinkedList<Integer>();  
	        list1.add(1);  
	        list1.add(2);  
	        list1.add(2);  
	        list1.add(3);  
	        list1.add(4);  
	        list1.add(5); 
	        
	               
	      List<Integer> list2 = new LinkedList<Integer>();
	        list2.add(6);  
	        list2.add(7);  
	        list2.add(8);  
	        list2.add(9);  
	        System.out.println("The list1 before addall is "+list1);
	        list1.addAll(list2);
	        
	        System.out.println("The list1 after addall is "+list1);
	}

}
