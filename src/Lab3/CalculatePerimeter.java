package Lab3;

public class CalculatePerimeter {

	int a,b,c;
	int perimeter;
	
	public int calcPerimeter(int a,int b,int c) {
		perimeter  = a+b+c;
		return perimeter;
	}
	
	public int calcPerimeter(int a) {
		perimeter  = 4*a;
		return perimeter;
	}
	
	public int calcPerimeter(int a,int b) {
		perimeter  = 2*(a+b);
		return perimeter;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatePerimeter c= new CalculatePerimeter();
		int p = c.calcPerimeter(2,3);
		
		System.out.println("Perimeter of Rect is "+ p);
		
		 p = c.calcPerimeter(2);
		
		System.out.println("Perimeter of square is "+ p);
		
		 p = c.calcPerimeter(2,3,4);
		
		System.out.println("Perimeter of triangle is "+ p);

	}

}
