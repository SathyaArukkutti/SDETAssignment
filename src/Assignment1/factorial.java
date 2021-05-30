package Assignment1;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		double n,i=1,f=1;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial: ");
		n = s.nextDouble();
		s.close();
		
		while(i<=n) {			
			f=f*i++;			
		}
		System.out.println("Factorial of " + n + " is: " + f);
	}

}
