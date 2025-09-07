package Array;

public class Day3 {
    public static void main(String[] args) {
        System.out.println("***************************Reverse a String****************************************");
        String str = "Hello";
        System.out.println(new StringBuilder(str).reverse().toString());
        System.out.println("***************************Palindrome****************************************");
        String str1 = "maam";
        String rev = new StringBuilder(str1).reverse().toString();
        if (str1.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("NOT");
        }
        System.out.println("******************************First non repeated character in String*************************************");
        String str3 = "success";
        for(char c : str3.toCharArray()){
            if (str3.indexOf(c) == str3.lastIndexOf(c)){
                System.out.println("First non-reapeated number is :"+c);
                return;
            }
        }
        System.out.println("No non-repeated number");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");

    }
}
