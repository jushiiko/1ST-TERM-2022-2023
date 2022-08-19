
//MARC STEVEN MARQUEZ
import java.util.Random;

public class LinearSearching {
    public static void main(String[] args) {
        int num[] = LinearSearching.addElement();
        int s = LinearSearching.MAX(num);
        System.out.println("Marc Steven Marquez");
        System.out.println("Highest number: " + LinearSearching.MAX(num));

    }

    public static int[] addElement() {
        int[] num = new int[Integer.MAX_VALUE / 5];
        Random r = new Random();
        int v = 0;
        for (int i = 0; i < num.length; i++) {
            v = r.nextInt(num.length - 1) + 1;
        }
        return num;
    }

    public static int MAX(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }

        long start = System.nanoTime();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == (Integer.MAX_VALUE / 5)) {
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " nanoseconds");
        return max;
    }

}