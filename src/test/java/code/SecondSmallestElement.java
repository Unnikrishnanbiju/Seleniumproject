package code;
import java.util.*;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr= {5,4,3,6,1,};
        Arrays.sort(arr);
        System.out.println("Second Smallest"+" " +arr[1]);
        System.out.println("Second Largest"+ " " + arr[arr.length-2]);
    }
}
