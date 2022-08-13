package DSA;
import java.util.*;   
import java.util.regex.*;
class Palindrome_ABLAY  
{  
   public static void main(String args[])  
   {  
      String original, orig, reverse = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      orig = in.nextLine(); 
    original = orig.toLowerCase();  
      Pattern pattern = Pattern.compile("[^a-z!@#$&()\\-`.+,/\"]*$]");
      Matcher matcher = pattern.matcher(original);
      boolean specialchar = matcher.find();
        if(specialchar){
            System.out.println("error");
            return;
        }
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- ){ 
          if (original.charAt(i) == ' '){
              System.out.println("error");
              return;
          }
          reverse = reverse + original.charAt(i);
      }  
      if (original.equals(reverse))  
         System.out.println("True");  
      else  
         System.out.println("False");   
   }  
}