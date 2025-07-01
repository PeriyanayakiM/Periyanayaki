import java.io.*;
import java.util.*;

public class dic{
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] counts = new int[10];
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i != 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}