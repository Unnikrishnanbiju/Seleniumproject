package code;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 8;
        boolean isPrime = num > 1;
        for (int i = 2; i <num/2 ; i++) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
            System.out.println(isPrime ? "prime":"Not Prime");
        }
    }
}
