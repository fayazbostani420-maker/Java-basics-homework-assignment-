package lotterynumber;

import java.util.Scanner;

public class LotteryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" This program select you for the lottery if you enter the correct number ");
        System.out.println(" Enter a number that should have only two digits:");
        int guessNumber = input.nextInt();
        int lotteryNumber =  (int)(Math.random() * 100);
        int lotteryNumberFirstdigit = lotteryNumber / 10;
        int lotteryNumberSeconddigit = lotteryNumber % 10;
        int guessNumberFirstdigit = guessNumber / 10;
        int guessNumberSeconddigit = guessNumber % 10;
        if ( lotteryNumber == guessNumber )
            System.out.println(" you Enter the correct Number , so you win 10000");
        else if ( lotteryNumberFirstdigit == guessNumberSeconddigit &&
                lotteryNumberSeconddigit== guessNumberFirstdigit)
            System.out.println(" you have win 3000$");
        else if ( lotteryNumberFirstdigit == guessNumberFirstdigit
           ||  lotteryNumberFirstdigit == guessNumberSeconddigit
           || lotteryNumberSeconddigit == guessNumberFirstdigit
           || lotteryNumberSeconddigit == guessNumberSeconddigit)
            System.out.println(" you have win 1000$");
        else System.out.println(" sorry , you have enter wrong Number");
        

    }
    
}
