package Lab8;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the frist String:");
        String string1 = input.next();
        
        System.out.println("Enter the second String:");
        String string2 = input.next();
        
        input.close();
        
        if (string1.equals(string2))
        	System.out.println("String1 " + string1 +  " & String2 " + string2 + " are equal");
        else 
        	System.out.println("String1 " + string1 +  " & String2 " + string2 + " are not equal");
            
        }
	}


