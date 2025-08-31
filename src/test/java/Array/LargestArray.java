package Array;

import java.util.Arrays;

public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,2,9,};
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);
        Arrays.sort(arr);
        System.out.println("Second Largets  "+arr[arr.length-2]);
    }
}
