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
        System.out.println("*************Duplicate Character***********************************************");
        String str = "data", result = "";
        for (char c: str.toCharArray())
            if (result.indexOf(c)<0)
                result += c;
        System.out.println(result);





        System.out.println("*******************PrimeNUmber*****************************************");
        int num1 = 7;
        boolean isPrime = true;

        if (num1 <=1) isPrime = false;
        for (int i = 2; i < num1 ; i++){
            if (num1 % i == 0) isPrime = false;
        }
        if (isPrime)
            System.out.println(num1 +" Is Prime");
        else System.out.println("NOt prime");
        System.out.println("**************************Odd and Even**********************************");
        System.out.println((num1 % 2 == 0)?"Even":"Odd");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
    }
}
