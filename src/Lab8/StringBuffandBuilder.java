package Lab8;

public class StringBuffandBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "hello";
		
		StringBuilder sb1 = new StringBuilder(s1);
        
        //String Builder
        sb1.append(" Sathya");
        System.out.println("StringBuilder sb1  " +sb1);
        
        //StringBuffer
        StringBuffer sb2 = new StringBuffer("Welcome ");
        sb2.append("to Java");
        System.out.println("StringBuffer sb2   " +sb2);

	}

}
