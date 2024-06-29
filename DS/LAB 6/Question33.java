import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("before swap " + a + " , " + b);
        swapNumber(a, b);
    }

    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap " + a + " , " + b);
    }

}
