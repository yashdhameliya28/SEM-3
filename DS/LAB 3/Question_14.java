import java.util.Scanner;
public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = sc.nextInt();
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int ans=0;
        if(m<n){
            for(int i=m ; i<=n ; i++){
                ans = ans + i;
            }
        }
        else{
            for(int i=m ; i>=n ; i--){
                ans = ans + i;
            }
        }
        System.out.println(ans);
    }
}
