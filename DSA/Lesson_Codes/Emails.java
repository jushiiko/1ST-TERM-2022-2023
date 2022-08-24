package DSA.Lesson_Codes;

import java.util.Scanner;

public class Emails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email[] = { "qwe@gmail.com", "rty@gmail.com", "uio@gmail.com", "ppp@gmail.com", "asd@gmail.com" };
        String username[] = { "qwe", "rty", "uio", "ppp", "asd" };
        String password[] = { "ewq", "ytr", "oiu", "ppp", "dsa" };

        System.out.print("Enter index: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Index      : " + 0);
            System.out.println("Email      : " + email[0]);
            System.out.println("Username   : " + username[0]);
            System.out.println("Password   : " + password[0]);

        } else if (number == 1) {
            System.out.println("Index      : " + 1);
            System.out.println("Email      : " + email[1]);
            System.out.println("Username   : " + username[1]);
            System.out.println("Password   : " + password[1]);
        } else if (number == 2) {
            System.out.println("Index      : " + 2);
            System.out.println("Email      : " + email[2]);
            System.out.println("Username   : " + username[2]);
            System.out.println("Password   : " + password[2]);
        } else if (number == 3) {
            System.out.println("Index      : " + 3);
            System.out.println("Email      : " + email[3]);
            System.out.println("Username   : " + username[3]);
            System.out.println("Password   : " + password[3]);
        } else {
            System.out.println("Index      : " + 4);
            System.out.println("Email      : " + email[4]);
            System.out.println("Username   : " + username[4]);
            System.out.println("Password   : " + password[4]);
        }

    }

}
