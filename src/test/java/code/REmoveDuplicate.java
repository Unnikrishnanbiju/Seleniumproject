package code;

public class REmoveDuplicate {
    public static void main(String[] args) {
        String str = "programmingg", res ="";
        for (char c : str.toCharArray())
            if (res.indexOf(c)<0)res += c;
        System.out.println(res);
        System.out.println("Hello");

    }
}

