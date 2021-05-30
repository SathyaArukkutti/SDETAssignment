package Arrays;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		double sum=0;
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=reader.nextInt();
        }
        reader.close();
        
        for(int item:arr) {
        	sum=sum+item;
        	        }
        System.out.println("Avg is " +(sum/arr.length));
	}

}
