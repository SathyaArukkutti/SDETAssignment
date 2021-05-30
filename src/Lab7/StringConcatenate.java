package Lab7;

public class StringConcatenate {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		      
	       String s1= "   She sells sea shells on the sea shore";
	       System.out.println("String 1 is  : " + s1.trim());
	       
	       String s2= "Pan Pun Prank Pit Pat";
	       s2=s2.replace('P', 'F');
	      // System.out.println(s2);
	       
	       System.out.println("String 2 is  : " + s2);
	       
	      String s3=s1+s2;
	    		   System.out.println("string concatenation using '+' : " + s3.trim()); 
	    		   System.out.println("string concatenation using concat method : " +s2.concat(s1).trim())	;  
       
	    
		}

	}


