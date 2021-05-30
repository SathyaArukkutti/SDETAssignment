package Lab9;

import java.util.Scanner;

public class ArrayExpection {

	           public static void main (String args[]) 
	           {
	              int array[] = {20,20,40}; //size = 3
	              int result = 0;
	              Scanner scanner = new Scanner(System.in);
		            System.out.println("Enter numner1:  ");
		            int num1 = scanner.nextInt();
		            System.out.println("Enter numner2:  ");
		            int num2 = scanner.nextInt();
		            scanner.close();
	             
	            
	                  result = divnum(num1,num2);
	                  System.out.println("The result is" +result);
	                  
	                /* for(int i = 5; i >= 0; i--) //loop goes from i=5 till i= 0 : 6 times
	                     {
	                        System.out.println("The value of element in the array is: " +array[i]);
	                     }*/
	             
	              
	              System.out.println("Check");
	              System.out.println("Reaching here.......");
	              
	           }
	

static int divnum(int a, int b) {
	int div=0;
	try {
	
	div = a/b;

	}
	catch(ArithmeticException ae) //catch(Exception e)
    {
        ae.printStackTrace();
        ae.toString();
    }
	return div;
}
}