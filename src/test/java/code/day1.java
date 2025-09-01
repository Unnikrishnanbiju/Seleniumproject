package code;

import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;

public class day1 {
    public static void main(String[] args) {
        String arr = "maam";

        System.out.println("*******************Reverse**************************");
        System.out.println(new StringBuilder(arr).reverse().toString());
        System.out.println("********************Palindrome*************************");
        String rev = new StringBuilder(arr).reverse().toString();
        if (arr.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
        System.out.println("**************✅ Find duplicate characters in a string*******************************");
        char[] chars = arr.toCharArray();
        System.out.println("Duplicate character");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                System.out.println(chars[i]);
            }

        }
        System.out.println("********************✅ Count vowels, consonants, digits, and spaces*************************");
        String str = "Hello world 123! love";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;

            else if (ch >= '0' && ch <= '9')
                digits++;

            else if (ch == ' ')
                spaces++;


        }
        System.out.println("Vowels "+vowels);
        System.out.println("Consonants " +consonants);
        System.out.println("digits "+digits);
        System.out.println("spaces "+spaces);





        System.out.println("*****************✅ Remove all whitespace from a string****************************");
        String spac = str.replaceAll(" ","");
        System.out.println(spac);

        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }
}
