package Assignment1;
import java.util.Scanner;
public class areaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int base,height;
		System.out.println("Enter the base of the triangle: ");
		base = s.nextInt();
		
		System.out.println("Enter the height of the triangle: ");
		height = s.nextInt();
		s.close();
		
		double area;
		
		area = (base*height)/2;
			
		System.out.println("Area of triangle is " + area);
		
	}

}
