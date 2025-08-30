package code;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "aaautomation ";
        System.out.println(new StringBuilder(name).reverse().toString());

        String rev ="";

        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev + name.charAt(i);

        }
        if (name.equals(rev)){
            System.out.println("palindrome");

        }else {
            System.out.println("Not");
        }
        System.out.println(rev+"  2nd one");


        System.out.println("*********************************************************************");
        System.out.println("Count character");

        char ch = 'a';
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==ch) count++;

        }
        System.out.println(count);
        System.out.println("*********************************************************************");


    }
}
