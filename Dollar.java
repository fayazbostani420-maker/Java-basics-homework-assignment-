
package dollar;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an Demical amount:");
        double amount = input.nextDouble();
         int remainingamount = (int)(amount * 100);
         int numberofDollars = remainingamount / 100;
         remainingamount = remainingamount % 100;
         int numberofQuarters = remainingamount / 25;
         remainingamount = remainingamount % 25;
         int numberofDimes = remainingamount / 10;
         remainingamount = remainingamount % 10;
         int numberofNickels = remainingamount / 5;
         remainingamount = remainingamount % 5;
         int numberofpennis = remainingamount;
         System.out.println(" your amount " + amount + " consists of: ");
         System.out.println(numberofDollars + " Dollars ");
         System.out.println(numberofQuarters + " Quarters ");
         System.out.println(numberofDimes + " Dimes ");
         System.out.println(numberofpennis + " pennis ");
         
         
    }
    
}
