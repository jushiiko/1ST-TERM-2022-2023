package DSA;

import java.util.*;

public class CustomerBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the brand: ");
        String b = input.nextLine();
        System.out.println("Enter the color: ");
        String c = input.nextLine();
        System.out.println("Enter the price: ");
        int price = input.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();
        double gross = price * quantity;
        double vat = 0.038 * gross;
        double net_total = gross + vat;
        System.out.println("\nBrand: " + b + "\nColor: "
                + c + "\nPrice: " + price + "\nQuantity: " + quantity);
        System.out.println("\nGross Total: " + gross + "\nVAT: "
                + vat + "\nNet Total: " + net_total);
        System.out.println("Enter your cash: ");
        double cash = input.nextDouble();
        double change = cash - net_total;
        System.out.println("Your change is: " + change);

    }
}
