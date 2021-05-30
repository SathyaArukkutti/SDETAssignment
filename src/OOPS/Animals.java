package OOPS;

public abstract class Animals {
	
	String name = " ";

	 public void basicDetails(String details) //concrete method
     { 
         System.out.println("---animals----"); 
         System.out.println(name + " " + details); 
     } 
	 
	 public abstract void habitat();//abstract //method signatures
     
     public abstract void respiration();	
	
}
