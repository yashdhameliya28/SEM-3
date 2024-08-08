import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                temp += j;
            }
        }
        System.out.println(temp);
    }

}