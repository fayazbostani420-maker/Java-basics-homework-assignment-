package se1;
import java.util.Scanner;
public class Se1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name and L.name");
     String Name = input.next();
        System.out.println("Enter the Math score");
     float Math = input.nextFloat();
     System.out.println("Enter the Physic score");
     float Physic = input.nextFloat();
     System.out.println("Enter the Chimestry score");
     float Chimestry = input.nextFloat();
     System.out.println("Enter the Dary score");
     float Dary = input.nextFloat();
     System.out.println("Enter the Biology score");
     float Biology = input.nextFloat();
     System.out.println("Enter the History score");
     float History = input.nextFloat();
     System.out.println("Enter the Geography score");
     float Gegoraphy = input.nextFloat();
     System.out.println("Enter the English score");
     float English = input.nextFloat();
     System.out.println("Enter the Pashto score");
     float Pashto = input.nextFloat();
     System.out.println("Enter the Computer score");
     float Computer = input.nextFloat();
     System.out.println("Enter the Sport score");
     float Sport = input.nextFloat();
     System.out.println("Enter the Dini score");
     float Dini = input.nextFloat();
     System.out.println("Enter the Tafser score");
     float Tafser = input.nextFloat();
     System.out.println("Enter the Tahzeb score");
     float Tahzeb = input.nextFloat();
     float Average = ((Math+Physic+Chimestry+Dary+Biology+History+Gegoraphy+English+Pashto+Computer+Sport+Dini+Tafser+Tahzeb)/1400)*100;
     if(Average >= 90) {
            System.out.println("The " + Name + " pass the exame");
        System.out.println("Average = " + Average );
         System.out.println("Group = ال�? ");
     }
     else if (Average >= 80) {
         System.out.println("The " + Name + " pass the exame");
     System.out.println("Average = " + Average );
         System.out.println("Group = ب ");
     }
     else if (Average >= 75) {
     System.out.println("The " + Name + " pass the exame");
     System.out.println("Average = " + Average );
         System.out.println("Group = ج ");
         
     }
      else if (Average >= 65) {
     System.out.println("The " + Name + " pass the exame");
     System.out.println("Average = " + Average );
         System.out.println("Group = د");
         
     }
      else {
     System.out.println("The " + Name + " fail the exame");
     System.out.println("Average = " + Average );
         System.out.println("Group = ه");
         
     }
     }
}