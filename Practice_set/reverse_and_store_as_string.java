public class reverse_and_store_as_string {
    public static void main(String[] args) {
        int n =1267;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev= rev *10 + digit;
            n/=10;
        }
        String revString = String.valueOf(rev);
        System.out.println("Reversed Number as String: " + revString);
    }
}