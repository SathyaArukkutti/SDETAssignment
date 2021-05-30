package Lab5;
import java.util.Scanner;

public class GradesofStudents {
		
	    public static void main(String[] args)
	    {
	        int marksObt = 0,passMarks=40;
	        String grade=" ";
	        String subject=" ";
	        Scanner input = new Scanner(System.in);
	        for(int i=0;i<5;i++)
	        {
	        
	        	switch(i) 
	        	{
	        	case 0:
	        		System.out.println("Enter the marks obtained in Electronics:");
	    	        marksObt = input.nextInt();
	    	        subject="Electronics";
	    	        break;
	        	case 1:
	        		System.out.println("Enter the marks obtained in ED:");
	    	        marksObt = input.nextInt();
	    	        subject="ED";
	    	        break;
	        	case 2:
	        		System.out.println("Enter the marks obtained in Maths:");
	    	        marksObt = input.nextInt();
	    	        subject="Maths";
	    	        break;
	        	case 3:
	        		System.out.println("Enter the marks obtained in Civil:");
	    	        marksObt = input.nextInt();
	    	        subject="Civil";
	    	        break;
	        	case 4:
	        		System.out.println("Enter the marks obtained in Mechanical:");
	    	        marksObt = input.nextInt();
	    	        subject="Mechanical";
	    	        break;
	    	    default:
	    	    		System.out.println("you have entered incorrect marks");
	        	} 
	     
	        if(marksObt >=passMarks)
	        {
	            if(marksObt >90){ //as long as there is a single line inside my if or else body
	                grade = "Excellent";}
	            else if(marksObt >75){
	                grade = "Very Good";}
	            else if (marksObt >60){
	                grade = "Good";}
	            else if (marksObt >40){
	                grade = "Average";}
	            System.out.println("Passed");
	        }
	        
	        else
	        {
	            grade = "Poor";
	            System.out.println("Try Harder");
	        }
	        System.out.println("Grade of the Student in: " + subject + " is: " + grade);
	       
	    }
	        input.close();    
	}
}
