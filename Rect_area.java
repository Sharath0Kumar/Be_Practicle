import java.util.Scanner;

public class Rect_area {
    public static void main(String[] args){
        Scanner len = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = len.nextInt();
        Scanner bre = new Scanner(System.in);
        System.out.println("Enter the breadth of the rectangle:");
        int Breadth = bre.nextInt();

        System.out.println("Area of the rectangle is: " + area(length, Breadth));
    }


    public static int area(int length, int Breadth){
        return length * Breadth;
    }
}


