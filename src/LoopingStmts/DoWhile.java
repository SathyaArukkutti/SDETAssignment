package LoopingStmts;

public class DoWhile {
	//printout numbers from 20 to 1 in reverse order
	    
	    public static void main(String[] args) 
	    {
	        int i=20;
	        //one iteration is guaranteed
	        do{
	            System.out.print(" "+i);
	            i--;
	        } while(i>0);
	    }
	}
