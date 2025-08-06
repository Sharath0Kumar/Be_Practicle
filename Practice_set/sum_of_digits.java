public class sum_of_digits {
    public static void main(String[] args) {
        int n = 1267;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
