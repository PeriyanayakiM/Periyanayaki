import java.io.*;
import java.lang.Math;
import java.util.*;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        double a, b, ans=0;
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Calculator");
        System.out.print("\nEnter a value: ");
        a = in.nextDouble();
        System.out.print("Enter b value: ");
        b = in.nextDouble();
        System.out.print("Operators: +, -, *,  / ");
        System.out.print("\nEnter your Choice: ");
        ch = in.next().charAt(0);
        switch (ch) {
            case '+':
                ans = a + b;
                System.out.println("Addition:"+ans);
                break;

            case '-':
                ans = a - b;
                System.out.println("Subtraction:"+ans);
                break;

            case '*':
                ans = a * b;
                System.out.println("Multiplication:"+ans);
                break;

            case '/':
                if (b == 0) { 
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    ans = a / b;
                    System.out.println("Division:"+ans);
                }
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
        in.close();
    }
}