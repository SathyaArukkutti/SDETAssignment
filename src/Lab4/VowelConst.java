package Lab4;

import java.util.Scanner;

public class VowelConst {

    public static void main(String[] args) {
    //int to double conversion is implicit  
       
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the Charactor: ");
  
   
   char s = scan.next().charAt(0); //charAt(0) is giving me the first character in that line
   
   //char is at 0th index of the input stream 
   //indices always begin with 0 in Java
 
   scan.close();
   
   switch(s) //d : char variable
   {
        case 'a'://+
        	System.out.println("Its a Vowel ");
            break;
        
        case 'e'://-
        	System.out.println("Its a Vowel ");
            break;
            
        case 'o'://*
        	System.out.println("Its a Vowel ");
            break;
            
        case 'i':
        	System.out.println("Its a Vowel ");
            break;
            
        case 'u':
        	System.out.println("Its a Vowel ");
            break;
            
        default: //&, @
            System.out.println("Its a Consonant");
   }
   
      System.out.println("The output is:" +s);
    }

}
