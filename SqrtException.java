import java.util.*;

public class SqrtException {
    public static void main(String[] args) throws ArithmeticException {
        // Write your code here
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num <= 0) {
                throw new ArithmeticException();
            }
            System.out.println("The square root of " + num + " is " + Math.sqrt(num));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Can't take square root of negative number.");
        }
    }
}

/**
 * import java.util.*;

public class SqrtException {
    public static void main(String[] args) throws ArithmeticException {
        // Write your code here
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num < 0) {
                throw new ArithmeticException("Can't take square root of negative number.");
            }
            System.out.println("The square root of " + num + " is " + Math.sqrt(num));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

 */
