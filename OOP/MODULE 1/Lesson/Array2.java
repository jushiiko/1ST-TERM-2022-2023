import java.util.*;

public class Array2 {
    
// a program that determines the biggest value in an array

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
        for (int d = 0; d < 10; d++) {
            System.out.println(myArray[d]);
        }
        System.out.println("Highest value: " + max);
        y.close();
    }

}
