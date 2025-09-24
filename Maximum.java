package maximum;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

//            this program finds Maximum of two numbers :
             System.out.println(" Enter the first number:");
             int number1 = input.nextInt();
             System.out.println(" Enter the second number:");
             int number2 = input.nextInt();
             System.out.println(" the Maximum number is:" +Math.max(number1, number2));

    }
    
}
