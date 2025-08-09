package Day4;

import java.util.Arrays;

public class topic3 {
    public static void main(String[] args) {
        int arr[] = {1, 90, 56, 34};
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("Max number in arr :" + arr[arr.length-1]);
    }
}
