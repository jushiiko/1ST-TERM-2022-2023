package DSA.Week1_StringAndData;

import java.util.Scanner;
import java.util.regex.*;

public class Piglatin_ABLAY {
    public static void main(String args[]) {
        System.out.println("John Sebastian Ablay");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(s);
        boolean specialchar = matcher.find();
        if (specialchar) {
            System.out.println("error");
            return;
        }

        int size = s.length();
        if (size <= 3 || size >= 10 || s.contains(" ")) {
            System.out.println("error");
            return;
        }

        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                break;

        }

        String f = s.substring(i) + s.substring(0, i) + "ay";
        System.out.println(f);

    }
}
// John Sebastian Ablay - A221