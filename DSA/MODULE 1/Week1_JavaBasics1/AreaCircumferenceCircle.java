package DSA.Week1_JavaBasics1;

import java.util.Scanner;

public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        double PI = 3.14;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            double area = PI * (radius * radius);
            double circumference = (2 * PI) * radius;
            System.out.println("The area of the circle is " + area);
            System.out.println("The circumference of the circle is " + circumference);
        }
        System.out.println("John Sebastian Ablay");
    }
// John Sebastian Ablay - A221
}
