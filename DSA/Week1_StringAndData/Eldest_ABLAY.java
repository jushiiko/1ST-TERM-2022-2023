package DSA.Week1_StringAndData;

import java.util.Scanner;

public class Eldest_ABLAY {
    public static void main(String[] args) {
        Eldest_ABLAY b = new Eldest_ABLAY();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your pets: ");
        n = sc.nextInt();

        String[] name = new String[n];
        String[] species = new String[n];
        String[] gender = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the name , species, gender,  and age of your pet no. %d\n", i + 1);
            name[i] = sc.next();
            species[i] = sc.next();
            gender[i] = sc.next();
            age[i] = sc.nextInt();
        }
        b.bsort(age, species, gender, name);
    }

    void bsort(int arr[], String spec[], String gen[], String name[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Your Pets are: " + "\t" + name[i] + "\t" + spec[i] + "\t" + gen[i] + "\t" + arr[i]);
        }
        System.out.println("John Sebastian Ablay");
    }

}
// John Sebastian Ablay - A221
