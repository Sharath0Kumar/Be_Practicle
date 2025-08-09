// import java.util.Arrays;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;
        // System.out.println(a<b);
        // System.out.println(a>b);
        // System.out.println(a==b);
        // System.out.println(a<=b);
        // System.out.println(a>=b);
        // System.out.println(a!=b);

//         int max = Math.max(a, Math.max(b, c));

// if (max == a) {
//     System.out.println("A is greatest");
// } else if (max == b) {
//     System.out.println("B is greatest");
// } else {
//     System.out.println("C is greatest");
// }

// int[] arr = {a, b, c};
// Arrays.sort(arr);  // sorts in ascending order

// System.out.println("Smallest: " + arr[0]);
// System.out.println("Second Greatest: " + arr[1]);
// System.out.println("Greatest: " + arr[2]);



        int greatest, second, smallest;

        // Check all possibilities
        if (a >= b && a >= c) {
            greatest = a;
            if (b >= c) {
                second = b;
                smallest = c;
            } else {
                second = c;
                smallest = b;
            }
        } else if (b >= a && b >= c) {
            greatest = b;
            if (a >= c) {
                second = a;
                smallest = c;
            } else {
                second = c;
                smallest = a;
            }
        } else {
            greatest = c;
            if (a >= b) {
                second = a;
                smallest = b;
            } else {
                second = b;
                smallest = a;
            }
        }

        // Print the results
        System.out.println("Greatest: " + greatest);
        System.out.println("Second Greatest: " + second);
        System.out.println("Smallest: " + smallest);


        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        int d=sc.nextInt();
        System.out.println(d);
    }
}




    