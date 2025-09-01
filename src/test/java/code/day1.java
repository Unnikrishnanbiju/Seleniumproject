package code;

import java.sql.SQLOutput;

public class day1 {
    public static void main(String[] args) {
        String arr = "maam";

        System.out.println("*******************Reverse**************************");
        System.out.println(new StringBuilder(arr).reverse().toString());
        System.out.println("********************Palindrome*************************");
        String rev = new StringBuilder(arr).reverse().toString();
        if (arr.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
        System.out.println("**************✅ Find duplicate characters in a string*******************************");
        char[] chars = arr.toCharArray();
        System.out.println("Duplicate character");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i +1; j < chars.length; j++) {
                System.out.println(chars[i]);
            }

        }
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }
}
