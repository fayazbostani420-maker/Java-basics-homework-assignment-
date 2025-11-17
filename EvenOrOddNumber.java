package even.or.odd.number;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
     int x = input.nextInt();
     
     if(x == 0)  
             System.out.println("Zero");
     else if(x % 2 == 0) 
             System.out.println("even");
             
     
     else 
             System.out.println("odd");
       
   }
     }

    
   
