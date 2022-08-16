package Lesson;

import java.util.*;

public class sales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double amount = 0;
        double total = 0;

        do {
            System.out.println("Item price: ");
            amount = s.nextDouble();
            if (amount != 0) {
                total += amount;
            } else {
                break;
            }
        } while (true);

        System.out.println("Total amount: " + String.format("%.2f", total));
    }
}
