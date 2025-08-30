package code;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "maam";
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

    }
}
