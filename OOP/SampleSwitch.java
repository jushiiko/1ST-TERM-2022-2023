import java.util.*;
public class SampleSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter the year level number: ");
        a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("First Year");
                break;
            case 2:
                System.out.println("Second Year");
                break;
            case 3:
                System.out.println("Third Year");
                break;
            case 4:
                System.out.println("Fourth Year");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    
}
