package bmi;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println(" Enter your height in inches: ");
        double height = input.nextDouble();
        final double Kilograms_per_pound = 0.45359237;
        final double Meters_per_Inch = 0.0254;
        double Weightinkilograms =weight * Kilograms_per_pound;
        double HeightinMeters = height * Meters_per_Inch;
        double bmi = Weightinkilograms / (HeightinMeters * HeightinMeters);
        System.out.println(" BMI is: " +bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
        
            
        
        
    }
    
}
