package DSA.Lesson_Codes;

public class Reverse {

    public static void main(String[] args) {
    
    String reverse="",str="Excellence and Innovation";
    
    int len=str.length()-1;
    
    for (int i = 0;i <=len; i++) {
    
    reverse=str.charAt(i)+reverse;
    
    }
    
    System.out.println(reverse);
    
    System.exit(0);
    
    }
    
    }
    
    