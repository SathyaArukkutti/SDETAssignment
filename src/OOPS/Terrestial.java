package OOPS;

class Terrestial extends Animals 
{ 
    // constructor 
    Terrestial(String name) 
    
    { 
       // super(name);
    	System.out.println(name);
    } 
    
   /* public void basicDetails(String details) //concrete method
    { 
        System.out.println("---terrestrial----"); 
        System.out.println(name + " " + details); 
    }*/
    
    public void habitat()  
    { 
        System.out.println("live on land");  
    } 
       
    public void respiration()  
    { 
        System.out.println("respire through nose");  
    }
}
