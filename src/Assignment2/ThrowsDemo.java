package Assignment2;

public class ThrowsDemo {

	public  static int div(int num1, int num2) throws ArithmeticException {
		int result=num1/num2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2,num2=0;
		int res = div(num1,num2);
		System.out.println("Result is : "+res);
	}

}
