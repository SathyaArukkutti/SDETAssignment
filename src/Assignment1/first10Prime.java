package Assignment1;

public class first10Prime {

	    public static void main(String[] args) {
	        
	       
	        int num=1,count=1;

	        while(count<=10) {
	        	
	        	num++; 
	            boolean flag = false;
	            for(int j=2;j<=num/2;j++) {
	            	
	                if(num%j == 0) 
	                { 
	                    flag = true;
	                    break;
	                    
	                    //System.out.println(flag);
	                }           
	                 
	            }
	            if(!flag) {
	            	System.out.print(num + ",");
	            	count++;}
	                   

	    }
	        
}
}