package subtraction;

import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
         while(true) {
     double number1 =  Math.random()*10;
     double number2 =  Math.random()*10;
     double CorectResault = (int)number1 - (int)number2;
     Scanner input = new Scanner(System.in);
   
        System.out.println("What is " + ((int)number1 + " - " + (int)number2));
        int Resault = input.nextInt();
        if( Resault == CorectResault) {
            System.out.println("your answer is true");
        }
        else
            System.out.println("your answer is fals");
     }
    }
    
}
