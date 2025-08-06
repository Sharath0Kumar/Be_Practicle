public class reverse {
    public static void main(String[] args) {
        int n = 1267;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
            // System.out.println("Current Digit: " + digit);
            // System.out.println("Current n Value: " + n);
            // System.out.println("Current Reversed Value: " + rev);

        }
        System.out.println("Reversed Number: " + rev);
    }
}
