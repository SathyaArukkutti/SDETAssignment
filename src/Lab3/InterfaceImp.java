package Lab3;

public class InterfaceImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA b1= new BankA();
		BankB b2= new BankB();
		System.out.println("Interest of bank A is  "+ b1.interest());
		System.out.println("Interest of bank B is  "+ b2.interest());

	}

}
