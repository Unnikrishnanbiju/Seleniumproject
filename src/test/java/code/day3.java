package code;

import java.util.Arrays;

public class day3 {
    public static void main(String[] args) {
        int[] a = {2,3,5,6,3,1,5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("***********************MIN and MAX*************************************");
int [] arr = {10,20,30,22,44,73};
int min = arr[0];
int max = arr[0];
for (int num :arr){
    if (num < min)min = num;
    if (num > max)max = num;
}
        System.out.println(min);
        System.out.println(max);
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
    }
}
