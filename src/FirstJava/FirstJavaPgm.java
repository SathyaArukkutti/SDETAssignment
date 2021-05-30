package FirstJava;

public class FirstJavaPgm {

	int d= 3;// instance variable 
	static int a= 3;//class varibles or static variables 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		//int a=3; //local variable, scope inside only this method
	}
	
	public void display() {
		System.out.println(d); //local to this method 
	}

}
