// a program that determines the biggest value in an array
package Lesson;

import java.util.*;

public class arrayTest1 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int myArray[] = new int[10];
        int max;

        System.out.println("Enter a value: ");
        myArray[0] = y.nextInt();
        max = myArray[0];

        for (int d = 1; d <= 9; d++) {
            System.out.println("Enter a value: ");
            myArray[d] = y.nextInt();
            if (max < myArray[d]) {
                max = myArray[d];
            }
        }
        System.out.println("Highest value: " + max);

    }

}
