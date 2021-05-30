package Assignment2;

public class ToCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Sathya";
		System.out.println("Original String: " + str);
		char[] ch= str.toCharArray();
		System.out.println("String conveted to Char array: ");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		String s2= String.valueOf(ch);
		System.out.println("Char array conveted to String: " +s2);
	}
}
