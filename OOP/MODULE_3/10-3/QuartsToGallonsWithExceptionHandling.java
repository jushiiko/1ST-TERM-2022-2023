import java.util.Scanner;

class QuartsToGallonsWithExceptionHandling {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        boolean valid;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter number of quarts needed: ");
            try {
                quartsNeeded = input.nextInt();
                valid = true;
            } catch (Exception e) {
                valid = false;
                input.nextLine();
            }
            if (valid) {
                gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
                extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
                System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");
            } else {
                System.out.println("Invalid input.");
            }
        } while (!valid);
    }
}
