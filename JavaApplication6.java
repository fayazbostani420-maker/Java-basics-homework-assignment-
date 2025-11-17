package javaapplication6;
import java.util.Scanner;
    public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.println("enter the amount of Dollar");
        float dollar = input.nextFloat();
         float cent = dollar*100;
         float penny = dollar*100;
    float quarter = penny/25;
    float dimes = penny/50;
    float nickles = penny/75;
       System.out.println(dollar + " Dollar" + " is " + cent + " Cent");
       System.out.println(dollar + " Dollar" + " is " + penny + " Penny");
        System.out.println(dollar + " Dollar" + " is " + quarter + " Quarter");
        System.out.println(dollar + " Dollar" + " is " + dimes + " Dimes");
        System.out.println(dollar + " Dollar" + " is " + nickles + " Nickles");
       
    }
    
}
    }