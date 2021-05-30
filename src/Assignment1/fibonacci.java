package Assignment1;
import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
	int n,i;
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the limit to find fibonacci: ");
	n = s.nextInt();
	s.close();
	System.out.print("Fibonacci sequence  is ");
	int a=0,b=1;
	
	
	System.out.print(a +","+ b);
	
	for(i=2;i<n;++i) {
		int c=a+b;
		System.out.print( "," + c);
		a=b;
		b=c;
	}
	
}

}