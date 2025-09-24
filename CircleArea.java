package circlearea;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        //               Area of the circle:
         System.out.println(" Enter the radius of the circle :");
         int radius = input.nextInt();
         double pi = 3.14;
         int Area = (int)(pi * radius * radius) ;
         System.out.println(" Area is:" + Area);
    }
    
}
