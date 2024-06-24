import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println(fac(x));
    }
}


    public static int fac(int x) {
        if (x == 1) {
            return 1;
        } else {
            try {
                return x * fac(x - 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

