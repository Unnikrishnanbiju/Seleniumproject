package code;

import java.util.LinkedHashSet;
import java.util.Set;

public class REmoveDuplicateString {
    public static void main(String[] args) {
        int[] arr = {7, -5, 3, 8, -4, 11, -19, 21, 3, -5, 7, 8,1,1,1,1};
        Set <Integer> set = new LinkedHashSet<>();
        for (int num : arr){
            set.add(num);
        }
        System.out.println(set  );
    }
}
