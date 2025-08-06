public class product_of_digits {
    public static void main(String[] args) {
        int n = 1267;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        System.out.println("Product of Digits: " + product);
    }
    
}
