package Array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
String str1 = "Listen";
String str2 = "Silent";

str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        if (str1.length() != str2.length()){
            System.out.println("NOt anagram");
            return;
        }
char[] arr1 = str1.toCharArray();
        char[] arr2 = str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }
    }
}
