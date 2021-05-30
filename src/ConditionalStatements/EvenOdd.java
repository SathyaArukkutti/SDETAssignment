package ConditionalStatements;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n;
		
		
		System.out.println("enter the numner: ");
		
		n= s.nextInt();
		s.close();
		
		if(n%2==0) 
			System.out.println("Number is even ");
		else
			System.out.println("Number is odd ");
		}
		
	}


