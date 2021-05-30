package OOPS;
import java.util.*;

public class MathsImplementor implements MathsInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathsImplementor m= new MathsImplementor();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a= scan.nextInt();
		
		System.out.println("Enter the first number:");
		int b= scan.nextInt();
		
		scan.close();
		m.add(a,b);
		m.subtract(a,b);
		m.multiply(a,b);
        m.divide(a,b);
	}
	public void add(int a, int b)
    {
        System.out.println("The sum is:" + (a+b));
    }
	public void subtract(int a, int b)
    {
        System.out.println("The difference is:" + (a-b));
    }
    public void multiply(int a, int b)
    {
        System.out.println("The product is:" + (a*b));
    }
    
    public void divide(int a, int b)
    {
        System.out.println("The quotient is:" + (a/b));
    }
}
