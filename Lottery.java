package lottery;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        while(true) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the first digit");
    int a = input.nextInt();
        System.out.println("enter the Second digit");
    int b = input.nextInt();
    int f = (int)((Math.random())*(10));
    int s = (int)((Math.random())*(10));
    if(a == f && b == s)
            System.out.println("you win 10000$");
    else if(a == s && b == f)
            System.out.println("you win 3000$");
    else if(a == f && b != s)
            System.out.println("you win 1000$");
    else if(a != f && b == s)
            System.out.println("you win 1000$");
    else
            System.out.println("you do not win anything");
        
        }
    }
    
}
