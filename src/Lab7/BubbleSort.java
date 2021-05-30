package Lab7;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str[]= {"Ciaz", "Alto", "Swift","Dezire", "Brezza"};
		System.out.println("Array after Sort is :" );
		String temp;
		
		for(int i=0;i<(Str.length);i++) {
			//System.out.println("Array before Sort is :" + Str[i]);
			for(int j=i+1;j<Str.length;j++) {
				if (Str[j].compareTo(Str[i]) <0){
					temp = Str[i];
					Str[i]=Str[j];
					Str[j]=temp;}}
			System.out.print(" " + Str[i]);}
		
	}

}
