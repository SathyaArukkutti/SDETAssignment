package Lab11;

import java.util.ArrayList;
import java.util.List;

import Collections.List.Book;

public class ContainsinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new ArrayList();
		l1.add("a");
		l1.add(1,"fff");
		
		 
          if(l1.contains("1"))
           System.out.println("The element is present at" + l1.indexOf("1")); 
          else
        	System.out.println("The element is not present");   
      
	}

}
