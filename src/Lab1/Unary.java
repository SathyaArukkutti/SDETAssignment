package Lab1;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=7;
		int x=4,y=8;
		
		int c= a++ + ++b;
		System.out.println(a); //6
		System.out.println(b);//8
		System.out.println(c);//13
		int d= ++a + b++;
		System.out.println(a); //7
		System.out.println(b);//9
		System.out.println(d);//15
		
		int z= x-- - --y;
		System.out.println(z);//-3
		System.out.println(x);//3
		System.out.println(y);//7
		
		int w= --x - y--;
		System.out.println(x);//3
		System.out.println(y);//6
		System.out.println(w);//-5
		
		

	}

}
