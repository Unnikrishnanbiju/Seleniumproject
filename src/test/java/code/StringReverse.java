package code;

public class StringReverse {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "";
        System.out.println(new StringBuilder(s1).reverse().toString());
    }
}
