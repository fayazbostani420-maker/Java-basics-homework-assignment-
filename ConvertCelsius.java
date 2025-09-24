package convertcelsius;

import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

//                  Convert Celsius to Farenheit :
                System.out.println(" Enter the celsius degree:");
                double celsius = input.nextDouble();
                double farenheit = ((9 * celsius)/5) + 32;
                System.out.println(" celsius to farenheit =" +farenheit);

    }
    
}
