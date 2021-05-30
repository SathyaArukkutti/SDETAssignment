package Lab10;
import java.util.Scanner;

public class UserdefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an even number");
        int number = scanner.nextInt();
        scanner.close();
        
        try
        {
        	checkInput(number);
        }
        
        catch(InvalidInputException e) {e.printStackTrace();
        System.out.println("Exception Caught -  number is not even");}

	}      
        
        public static void checkInput(int number) throws InvalidInputException{
        	if(number%2!=0)
	            throw new InvalidInputException("Exception");
	        else
	            System.out.println("The number is even");
        }
        
	}       

	 class InvalidInputException extends Exception{
		 InvalidInputException(String excep){
			 super(excep);}
		 }
		 

		 
