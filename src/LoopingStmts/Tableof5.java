package LoopingStmts;

import java.util.Scanner;

public class Tableof5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = scan.nextInt();
        
        scan.close();
        
               
        int count;
        
               for(int i=1;i<=10;i++) 
        {
        	count = i*num;
        	System.out.println(i + "*" + num + "=" + count);
            
        }
        
    }

}