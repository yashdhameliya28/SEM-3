import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1000;
        for (a = 1; a <= b; a++) {
            int count = 0, rem = 0, x = 0;
            int temp = a;
            while (a > 0) {
                count++;
                a = (a / 10);
            }
            // for addtion
            a = temp;
            while (a > 0) {
                rem = a % 10;
                x += Math.pow(rem, count);
                a = (a / 10);
            }
            // compare
            if (temp == x) {
                System.out.println("number is Armstrong " + x);
            } else {
                System.out.println("number is not Armstrong");

            }
        }
    }
}
