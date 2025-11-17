package perimeterofrectangle;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lengh of rectangle");
        double l = input.nextDouble();
        System.out.println("Please enter the width of rectangle");
        double w = input.nextDouble();
        System.out.println("The Permiter of rectangle = " + (2*l+2*w));
    }
    
}

