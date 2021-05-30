package Assignment1;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,34,5,6,233};
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order: "); 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);  
		}
	}

}
