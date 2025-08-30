package code;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Unni krishnan";
        System.out.println(new StringBuilder(name).reverse().toString());

        String rev = " ";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev + name.charAt(i);

        }
        System.out.println(rev+"  2nd one");

    }
}
