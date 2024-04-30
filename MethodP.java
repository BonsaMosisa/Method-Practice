import java.lang.Math;
import java.util.Scanner;

public class MathodP {

    public static void main(String[] args) {
        System.out.println("Welcome to squaareroot calculator")
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println(Math.max(12,13));
        System.out.println("Square root of the Number " + number + " is " + squareRoot);
        int Num;
        Scanner Keyb=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER TO FIND SQORT :");
        Num=Keyb.nextInt();
        System.out.println("The Square root of "+ Num +" is "+ Math.sqrt(Num));
        System.out.println("I will add more functions to this");
    }
}
