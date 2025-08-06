import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sr.nextInt();
        
        // check whether the number is prime or not
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // print yes if the number is prime, otherwise print no
        System.out.println(isPrime ? "yes" : "no");

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        
    }
}
