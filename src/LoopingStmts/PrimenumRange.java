package LoopingStmts;

import java.util.Scanner;

public class PrimenumRange {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number1: ");
        int num1 = scan.nextInt();
        
        System.out.println("Please input the number2: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println("Prime numbers between "+ num1 + "&" + num2 + "are: ");
       
        
       // int count = 0;
        
        while(num1<=num2) {
        	
        boolean flag = false;
        for(int j=2;j<=num1/2;j++) {
          
            if(num1%j == 0) 
            { 
                flag = true;
                break;
               
                //System.out.println(flag);
            }           
            
        }
        if(!flag)
        	System.out.println(num1);
        ++num1;        
       
    }
    }

}