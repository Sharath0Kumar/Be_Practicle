public class palindrome {
    public static void main(String[] args) {
        
        int num = 121;
        int original = num;
        int rev = 0;
        while(num>0){
            int digit = num %10;
            rev = rev *10 + digit;
            num /= 10;
        }
        if(original == rev){
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
        
    }

}
