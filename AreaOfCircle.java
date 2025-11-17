package areaofcircle;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of Circle");
        double r = input.nextDouble();
        double a = Math.PI*r*r;
        System.out.println(a);
    }
}