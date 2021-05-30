package Assignment1;
import java.util.Scanner;
public class first20Naturalnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=0,count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of naturals numbers to be summed up:  ");
		count = s.nextInt();
		s.close();
		for(i=1;i<=count;i++) {
			num=num+i;				
		}
		System.out.print(num);
	}

}
