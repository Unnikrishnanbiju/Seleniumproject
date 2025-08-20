package code;

public class Palindrome {
    public static void main(String[] args) {
         String s1 = "maam";
         String rev = new StringBuilder(s1).reverse().toString();

         if(s1.equals(rev)){
             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not palindrome");
         }
    }
}
