package Assignment1;
import java.util.Scanner;
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=0;
		System.out.println("Enter the size of the Array: ");
		n = s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
		System.out.println("Enter the elements of the Array: ");
		arr[i]=s.nextInt();}
		
		System.out.println("Elements of array entered by YOU: "); 
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);  }
		System.out.println("Elements of array in reverse order is :  "); 
		for(int k=arr.length-1;k>=0;k--) {
			System.out.println(arr[k]);  }
		s.close();
	}

}
