package Lab9;
import java.util.*;
public class trycatchfinally {


	      public int divide(int num1, int num2){
	    	  int result=0;
	            try{  
	                result=num1/num2;  
	                System.out.println("Result after division : "+result); 
	                
	            }
	            catch(ArithmeticException e){
	               e.printStackTrace();
	            }
	            finally
	            {
	                System.out.println("I am inside finally block");
	                
	            } 
	            return result;
	        }
	        
	        public static void main(String args[]){
	            Scanner scanner = new Scanner(System.in);
	            System.out.println("Enter number 1 : ");
	            int num1 = scanner.nextInt();
	            System.out.println("Enter number 2 : ");
	            int num2 = scanner.nextInt();
	            trycatchfinally t= new trycatchfinally();
	            int a=  t.divide(num1,num2);
	            scanner.close();
	            System.out.println("Finally block is always executed even when there is an exception");
	        }
	    }

