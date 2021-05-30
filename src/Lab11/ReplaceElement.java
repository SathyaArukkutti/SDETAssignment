package Lab11;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new ArrayList();
		l1.add("a");
		l1.add(1,"fff");
		
		
		System.out.println(l1.get(1));
		
		l1.set(1,"sathya");
		System.out.println(l1.get(1));
	}

}
