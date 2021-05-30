package Assignment2;
import java.util.Scanner;
public class NestedTry {
	
		   public static void main(String args[]){
			   Scanner scanner = new Scanner(System.in);
	            System.out.println("Enter numner1:  ");
	            int num1 = scanner.nextInt();
	            System.out.println("Enter numner2:  ");
	            int num2 = scanner.nextInt();
	            scanner.close();
			 //Parent try block
		     try{
		    	//Child try block1
		         try{
		            System.out.println("Inside block1");
		            int res=num1/num2;
		            System.out.println(res);
		         }
		         catch(ArithmeticException e1){
		            System.out.println("Exception: caught arthimetic expression");
		         }
		         //Child try block2
		         try{
		            System.out.println("Inside block2");
		            int res=num1/num2;
		            System.out.println(res);
		     	}		
		         catch(ArrayIndexOutOfBoundsException e2){
		            System.out.println("Exception: e2");
		         }
		        System.out.println("Just other statement");
		    }
		    catch(ArithmeticException e3){
		    	 System.out.println("Arithmetic Exception");
		         System.out.println("Inside parent try catch block");
		    }
		    catch(ArrayIndexOutOfBoundsException e4){
		    	System.out.println("ArrayIndexOutOfBoundsException");
		         System.out.println("Inside parent try catch block");
		    }
		    catch(Exception e5){
		    	System.out.println("Exception");
		         System.out.println("Inside parent try catch block");
		    }
		    System.out.println("Next steps...");
		  }
		}

