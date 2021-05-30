package Assignment2;

import java.util.Scanner;

public class StrContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "My name is Sathya";
		String ans;
		Scanner input = new Scanner(System.in);
		do {
		
		System.out.println("Enter a word to search");
        String searchstr = input.next();
            
        	
		if(s1.contains(searchstr)) 
      	  System.out.println(searchstr + " is present");
		else
			System.out.println(searchstr + " is not present");
		
		System.out.println("Do you want to search another word(Y/N): ");
        ans = input.next(); 
         
        
		}while(ans.equalsIgnoreCase("Y"));
		
		System.out.println("Thank you");
		
		input.close(); 
	}
	}


