package swaptownumber;

import java.util.Scanner;

public class SwapTowNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = input.nextInt();
        System.out.println("a swap to what number");
        int b = input.nextInt();
        System.out.println("befor swap " + "a = " + a + " b = " + b );
        int x = a;
        a = b;
        b = x;
        System.out.println("after swap " + " a = " + a + " b = " + b);
    }
    
}
       

