import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sr.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}