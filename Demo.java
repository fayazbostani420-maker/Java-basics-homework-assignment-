
package demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter an integar ");
        int number = input.nextInt();
        if ( number % 2 == 0)
            System.out.println(" Hi Even");
        if ( number % 5 == 0)
            System.out.println(" Hi Five");
    }
}