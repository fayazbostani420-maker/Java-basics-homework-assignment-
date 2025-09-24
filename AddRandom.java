package addrandom;

import java.util.Scanner;

public class AddRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double number1 = (int)(Math.random() * 10);
        double number2= (int)(Math.random()* 10);
        System.out.println( (int)(number1)+ "+"+(int)number2+"=?");
       int mainresult = (int)(number1+number2);
       int userresult = input.nextInt();
    if (mainresult == userresult)
            System.out.println("True");
    else
            System.out.println("False");
        
        
        
        
        
    }
    
}
