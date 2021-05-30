package Lab4;

import java.util.Scanner;

public class PosNegNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n;
		
		
		System.out.println("enter the number: ");
		
		n= s.nextInt();
		s.close();
		
		if(n>0) 
			System.out.println("Number is positive ");
		else
			System.out.println("Number is negative ");
		}
		
	}

