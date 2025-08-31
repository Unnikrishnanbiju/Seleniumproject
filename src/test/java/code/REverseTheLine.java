package code;

public class REverseTheLine {
    public static void main(String[] args) {
        String a= "Im Java Programer";

        String[] words = a.split(" ");
        for (int i = words.length-1; i >= 0 ; i--) {
            System.out.println(words[i]);

        }
        String rev = new StringBuilder(a).reverse().toString();
        System.out.println(rev);
    }
}
