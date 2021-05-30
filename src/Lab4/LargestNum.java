package Lab4;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2,num3;
	    
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the first number: ");
		   num1 = scan.nextDouble();
		   
		   System.out.println("Enter the second number: ");
		   num2 = scan.nextDouble();
		   
		   System.out.println("Enter the third number: ");
		   num3 = scan.nextDouble();
		   scan.close();
		   if (num1 >= num2 && num1>=num3)
			   System.out.println(num1 + "is the largest number ");
		   else  if (num2>= num1 && num2>=num3)
			   System.out.println(num2 + "is the largest number ");
		   else 
		   	   System.out.println(num3 + "is the largest number ");
	}

}
