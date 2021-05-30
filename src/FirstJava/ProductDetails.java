package FirstJava;

public class ProductDetails {
	
	int pid;
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	String pname;
	int price;
	
	/*ProductDetails(int pid,String pname,int price){
		this.pid= pid; 
        this.price = price;
        this.pname=pname;
	}*/
	
	void showProductDetails()
    {
        System.out.println("ProductId is: " +pid);
        System.out.println("Price is: " +price);
        System.out.println("Name is: " +pname);
    }
    
	 //behaviour
    //called function
    void setProductDetails(int pid, int price, String pname) //parameters
    {
        //this is a keyword to indicate this object
        //LHS belongs the object, RHS belongs to only this method
         this.pid= pid; 
         this.price = price; 
         this.pname=pname;
         
        
    }
    //calling function here is main()
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        
        ProductDetails p1 = new ProductDetails();
        p1.setProductDetails(1,234,"Pen");
        p1.showProductDetails();
        p1.setPrice(450);
        int pr = p1.getPrice();
        System.out.println("Price returned is :" + pr);
   
		

	}

}
