public class add_digits {
     public static void main(String[] args){
        add_digits solution = new add_digits();
        int num = 38; 
        int result = solution.addDigits(num);
        System.out.println("Result: " + result);

     }
    public int addDigits(int num) {
        while (num >= 10) {  
            int sum = 0;
            while (num > 0) {
                sum += num % 10; 
                num /= 10;        
            }
            num = sum;  
        }
        return num;
    }
     
}
