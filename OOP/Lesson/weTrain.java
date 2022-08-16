package Lesson;

import java.util.*;

public class weTrain {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int p;
        double amount = 0;

        System.out.println("Enter number of registered persons: ");
        p = n.nextInt();

        if (p >= 1 && p < 5) {
            amount = p * 100;
            System.out.println("Total Amount Due: " + String.format("%.2f", amount));

        } else if (p >= 5 && p < 11) {
            amount = p * 80;
            System.out.println("Total Amount Due: " + String.format("%.2f", amount));

        } else if (p >= 11) {
            amount = p * 60;
            System.out.println("Total Amount Due: " + String.format("%.2f", amount));

        } else {
            System.out.println("Invalid input.");
        }
    }
}
