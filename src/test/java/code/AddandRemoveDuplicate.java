package code;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddandRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {7, -5, 3, 8, -4, 11, -19, 21};
        int[] arr2 = {6, 13, -7, 0, -4, 3, -5};

        Set<Integer> resultSet = new LinkedHashSet<>();

        for(int num :arr1){
            resultSet.add(num);

        }

        for(int num :arr2){
            resultSet.add(num);

        }
        Integer[] mergedArray = resultSet.toArray(new Integer[0]);
    }
}
