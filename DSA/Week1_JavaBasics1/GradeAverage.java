package DSA.Week1_JavaBasics1;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int English, Math, Science;
        double Average;
        System.out.println("Enter the English grade: ");
        English = d.nextInt();
        System.out.println("Enter the Math grade: ");
        Math = d.nextInt();
        System.out.println("Enter the Science grade: ");
        Science = d.nextInt();
        Average = (English + Math + Science) / 3;
        System.out.println("The average is: " + Average);
        System.out.println("John Sebastian Ablay");
    }
}
// John Sebastian Ablay - A221