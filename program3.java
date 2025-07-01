import java.io.*;
import java.lang.Math;
import java.util.*;
import java.util.Scanner;
public class odd {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value:");
        n=in.nextInt();
        System.out.print("Output");
        int count = (n % 2 == 0) ? n - 1 : n;
        for (int i = 0; i < count; i++) {
            int odd = 2 * i + 1;
            System.out.print("\n"+odd);
            if (i < n - 1) {
                System.out.print( ",");
            }
        }
    }
}