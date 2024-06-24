import java.util.Scanner;
public class Question_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("enter value");
            a[i] = sc.nextInt();
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.println(a[i]);
        }
    }
}