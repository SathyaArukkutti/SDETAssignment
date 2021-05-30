package FirstJava;

public class EmployeeExample {
	
	private int emp_id;//Jvm will automatic value if we dont assign value 
	private String emp_name;
	private String designation;
	private int age;
	
	//constructor : initialization
	//Constructor outside main, parameterized constructor
	//constructor will be called first in any program
	//if no custom defined constructor, JVM will use default one
	//no return type
	
	EmployeeExample(int age,int emp_id,String emp_name,String designation){
		//this operator : this object
        //LHS : object , RHS : method
	this.age=age;
	this.designation=designation;
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeExample e1= new EmployeeExample(24,123,"sathya","manager");
		//e1.age=45;
		//e1.emp_id=123;
		//e1.designation="boss";
		//e1.emp_name="Sathya";
		e1.display();
		
		EmployeeExample e2= new EmployeeExample(34,456,"muthu","boss");
		//e2.age=34;
		//e2.emp_id=234;
		//e2.designation="big boss";
		//e2.emp_name="Muthu";
		e2.display();
	}
	
	//behaviour
	public void  display() {
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(age);
		System.out.println(designation);
	}

}
