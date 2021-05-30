package Exceptions;

public class NumberformatException {

    public static void main(String args[]) {
        try {
            //you expected an integer input value, user ends up giving a String
            int num = Integer.parseInt("3456");
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Number format exception occurred");
        }
    }
}