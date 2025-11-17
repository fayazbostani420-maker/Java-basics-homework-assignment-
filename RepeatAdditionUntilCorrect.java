package repeatadditionuntilcorrect;
import java.util.Scanner;
public class RepeatAdditionUntilCorrect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program is an addition quiz for elementry students: ");
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
      
        System.out.print("what is"+num1+"+"+num2+"=?");
        double answer =input.nextDouble();
                
        while(num1+num2!=answer){
            System.out.println("your answer is wrong!");
           
             System.out.print("what is"+num1+"+"+num2+"=?");
             answer =input.nextDouble();
            
        }
      
   }
}
