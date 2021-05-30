package Lab12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list1 = new LinkedList<String>();  
	        list1.add("sat");  
	        list1.add("sathya");  
	        list1.add("sathya a");  
	   
	        
	        System.out.println("Value of maximum element from the collection: "+ Collections.max(list1));  //max of list
	        System.out.println("Value of minimum element from the collection: "+ Collections.min(list1));  //min of list
	       	}

}
