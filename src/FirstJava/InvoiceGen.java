package FirstJava;

public class InvoiceGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemA=1000,itemB=140,itemC=130;
		
		double tot_amt,disc,tax;
		
		tot_amt = ((itemA*5)+(itemB*3)+(itemC*7));
		
		System.out.println("The Total amt before discount is:" + tot_amt);
		
		disc = (0.15 *tot_amt);
		
		tot_amt -= disc;
		System.out.println("The Total amt after discount & before tax is:" + tot_amt);
		
		tax=(.02*tot_amt);
		
		
		tot_amt += tax;// short hand notation 
		
		 System.out.println("The Total amt after tax is:" + tot_amt);
		 
		 if (tot_amt>=2000) {
			 System.out.println("Congrats, you won a coupon");
		 }
		 else
		 {
			 System.out.println("Thanks for visitng the store");
		 }
		 

	}

}
