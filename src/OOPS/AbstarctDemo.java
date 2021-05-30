package OOPS;

public class AbstarctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals t1= new Terrestial("Lions");
		t1.basicDetails("are terrestrial animals."); //from animals
        t1.habitat(); //from terrestrial
        t1.respiration(); //from terrestrial
        
        Animals t2= new Aquatic("Fishes");
        t2.basicDetails("are aqautic animals."); //from animals
        //t2 = new Aquatic("Fishes"); //polymorphism
        t2.habitat(); //from aquatic
        t2.respiration(); //from aquatic
        //System.out.println(" ");
	}

}
