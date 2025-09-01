package code;

import java.sql.SQLOutput;

public class day1 {
    public static void main(String[] args) {
        String arr = "maam";

        System.out.println("*********************************************");
        System.out.println(new StringBuilder(arr).reverse().toString());
        System.out.println("*********************************************");
        String rev = new StringBuilder(arr).reverse().toString();
        if (arr.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }
}
