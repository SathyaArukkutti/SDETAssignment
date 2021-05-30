package Strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3= new String("Hello");
		String str4= new String("Hello");
		
		char ch[]= {'s','a','t'};
		String s2 = new String(ch);
		System.out.println(s2);	
		
		//comparison of strings
        //str1 and str2 are both pointing to the same memory location, the same string literal
        //str3 and str4 are two String objects in memory both having a value of "Hello"
        
        //== compares hashcodes and not content //shallow comparison : memory locations checked 
          if(str3==str4) 
          {
              System.out.println("str3==str4"); } 
          else 
          { 
              System.out.println("str3!=str4");
         }
          
          String s5 = "Rohit,Virat,Shikhar,Ashwin";
          
          //s5=s5.toUpperCase();
          //System.out.println(s5);
          
          System.out.println(s5.length());
          
          if(s5.contains("rat")) {
        	  System.out.println(" Rat is present");}
          
       String s6= "   She sells sea shells on the sea shore";
       System.out.println(s6.trim()); 
       
       String s7= "Pan Pun Prank Pit Pat";
       s7=s7.replace('P', 'F');
       System.out.println(s7);
       
      String s8=s6+s7;
    		   System.out.println(s8.trim()); 
    		   System.out.println(s6.concat(s7).trim())	;  
    
    int index1 = s5.indexOf("Virat");
    System.out.println("Index of Virat: " +index1); 
    
    int index2= s5.lastIndexOf('i');
    System.out.println("Index of i: " +index2);
    
    
	}

}
