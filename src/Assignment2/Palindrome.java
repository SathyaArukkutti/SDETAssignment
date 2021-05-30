package Assignment2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String ans=" ";
		do {
		System.out.println("Enter a word: ");
        String palin = input.next();
                
        String reverse="";
        
        for(int i=(palin.length()-1);i>=0;i--){
        	reverse=reverse+palin.charAt(i);
       	
        }
        reverse=reverse.trim();
        if(palin.equalsIgnoreCase(reverse)) {
        	System.out.println(palin + " & " + reverse + " is a plaindrome");}
        else
        	{System.out.println(palin + " & " + reverse + " is not a plaindrome");}
        System.out.println("Do you want to contune(Y/N): ");
        ans= input.next();
		} while(ans.equalsIgnoreCase("Y"));
		input.close();
        }
	
	}


