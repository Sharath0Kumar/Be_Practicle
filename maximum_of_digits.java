public class maximum_of_digits {
    public static void main(String[] args) {
        
        int number = 123456789;
        int maxDigit = 0;   
        while (number > 0) {
            int digit = number % 10; 
            if (digit > maxDigit) {
                maxDigit = digit; 
            
            number /= 10; 
        }
    }
        
        System.out.println("The maximum digit is: " + maxDigit);
        
}

}
