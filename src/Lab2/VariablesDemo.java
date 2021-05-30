package Lab2;

public class VariablesDemo {
	
	int a = 5;
	static int b=8;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesDemo.b= 9;
		double d= 2;
		//String a="Sathya";
		//System.out.println("Im an instance variable: " + a);
		System.out.println("Im a static variable: " + VariablesDemo.b);
		System.out.println("Im a local variable: " + d);
	
	
	VariablesDemo v1 = new VariablesDemo();
	v1.display();
	v1.display1();
	}
	public void display() {
		int mvar = 3;
		
		System.out.println("Im inside method: " + mvar);
		System.out.println("Im static variable insdie display1: " + b++);
		System.out.println("Im instance variable: " + a++);
		
		}
	
public void display1() {
	int mvar = 3;
	
	System.out.println("Im inside method: " + mvar);
	System.out.println("Im static variable inside display2: " + ++b);
	System.out.println("Im instance variable" + a);
	
	}
}
