package Array;

public class Anagram {
    public static void main(String[] args) {
String str1 = "Listen";
String str2 = "Silent";

str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        if (str1.length() ! = str2.length()){
            System.out.println("NOt anagram");
            return;
        }

    }
}
