import java.util.Scanner;
public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int ans = 0;
        for(int i=0 ; i<=n ; i++){
            ans = ans + i;
        }
        System.out.println(ans/n);
    }
}
