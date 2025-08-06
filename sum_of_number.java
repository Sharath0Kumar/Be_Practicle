import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sr.nextInt();
        
        // calculate the sum of numbers from 1 to num
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
    }
}
