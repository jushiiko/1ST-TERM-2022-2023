package DSA.Week2_AlgorithmAnalysis;

import java.util.Random;

public class LinearSearching2 {
  public static void main(String[] args) {
    System.out.println("John Sebastian Ablay");
    int num[] = LinearSearching2.addElements();
    System.out.println("The highest number is: " + LinearSearching2.MAX(num));
  }

  public static int[] addElements() {
    int num[] = new int[Integer.MAX_VALUE / 5];
    Random rnd = new Random();
    int val = 0;
    for (int i = 0; i < num.length; i++) {
      val = rnd.nextInt(num.length - 1) + 1;
      num[i] = val;
    } 
    return num;
  }

  public static int MAX(int num[]) {
    int highest = num[0];
    for (int i = 0; i < num.length; i++) {
      if (num[i] > highest) {
        highest = num[i];
      }
    }
    long start = System.nanoTime();
    for (int i = 0; i < num.length; i++) {
      if (num[i] == (Integer.MAX_VALUE /5)) {
        break;
      }
    }
    long end = System.nanoTime();
    System.out.println("The time taken to search is: " + (end - start) + " nanoseconds");
    return highest;
  }
}
// John Sebastian Ablay - A221