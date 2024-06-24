import java.util.Scanner;
public class Fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        int ans = 1;
        for(int i=1 ; i<=x ; i++){
           ans = ans*i;
        }
        System.out.println(ans);
    }
}
