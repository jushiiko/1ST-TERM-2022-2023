// a java application that accepts two numbers from the console
import java.util.*;
public class SampleInOut {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n1, number2;
        int sum = 0;
        System.out.println("Enter the first number: ");
        n1 = d.nextInt();
        System.out.println("Enter the second number: ");
        number2 = d.nextInt();
        sum = n1 = number2;
        System.out.println("Sum: " + sum);
    }
}
