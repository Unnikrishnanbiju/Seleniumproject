package code;

public class LastNonRepeated {
    public static void main(String[] args) {
        String str = "programming ";
        for (int i = str.length() - 1; i >= 0 ; i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("last non - repeating ch " + ch);
                break;
            }

        }
        System.out.println(ch);
    }
}
