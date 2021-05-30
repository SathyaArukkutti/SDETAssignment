package Arrays;
import java.util.Scanner;
public class Print2DimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   
    int arraySize;
    Scanner scan = new Scanner(System.in);
    System.out.println("How many students will you enter?: ");
    arraySize = scan.nextInt();
    
    String students[][] = new String[arraySize][2];
    
    System.out.println("Entering values for "+students.length+ " students");
    for(int column=0; column<arraySize;column++) {
        System.out.println("================================");
        for(int row=0;row<2;row++) {
            System.out.println("Enter student's #"+ (column+1) +" name: ");
            students[column][row] = scan.next();
        }   
    }
    scan.close();
    
    System.out.println("********* Printing values *********");
    
    for(int column=0; column<arraySize;column++) {
        
        System.out.println("Values for student #"+ (column+1) +" are: ");
        for(int row=0;row<2;row++) {
            System.out.print(students[column][row]);
        }   
        System.out.println("********************************");
    }

	}
}