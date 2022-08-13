package DSA;

import java.util.Scanner;
import java.util.regex.*;

public class Piglatin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.next();
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(s);
        boolean specialchar = matcher.find();
        if (specialchar) {
            System.out.println("error");
            return;
        }

        // MGA BAWAL
        int size = s.length();
        if (size <= 3 || size >= 10) {
            System.out.println("error");
            return; // limits word length
        } else if (s == (" ")) {
            System.out.println("error");
            return;
        }

        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                break; // means vowel is found at i

        }

        String f = s.substring(i) + s.substring(0, i) + "ay";
        System.out.println(f);

    }
}