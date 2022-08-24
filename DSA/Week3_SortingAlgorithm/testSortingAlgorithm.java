package DSA.Week3_SortingAlgorithm;

import java.util.Scanner;

public class testSortingAlgorithm {
    public static void main(String[] args) {
        // John Sebastian Ablay - A221
        System.out.println("John Sebastian Ablay");

        sortingAlgorithm b = new sortingAlgorithm();

        System.out.println("Enter N (number) to put in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements to put in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("1 - Bubble Sort\n2 - Insertion Sort \n3 - Exchange Sort \nEnter your method: ");
        int choice = sc.nextInt();
        int agree = 0;
        if (choice == 1) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.bubbleSort(arr, agree));
        }
        if (choice == 2) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.insertionSort(arr, agree));
        }
        if (choice == 3) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.exchangeSort(arr, agree));
        }
    }
}
