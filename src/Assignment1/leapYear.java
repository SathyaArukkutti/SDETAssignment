package Assignment1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter any year ");
		n = s.nextInt();
		s.close();
		
		if(n%4==0)
			System.out.println(n+ " is a LEAP year");
		else
			System.out.println(n+ " is a not a LEAP year");	
		}
	}

