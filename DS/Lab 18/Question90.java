import java.util.*;
import java.util.Scanner;

public class Question90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter value of array element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int index = linearSearch(arr, length, n);
        if (index != -1) {
            System.out.println("element at index = " + index);
        } else {
            System.out.println("element not found ");

        }
    }

    public static int linearSearch(int[] arr, int length, int n) {
        for (int i = 0; i < length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
