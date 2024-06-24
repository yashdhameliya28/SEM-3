import java.util.Scanner;
public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter value");
            a[i] = sc.nextInt();
        }
        int min = a[0],mini = 0;
        int max = a[0],maxi = 0;
        for(int i=0 ; i<n ; i++){
            //smallest num
            if(min>a[i]){
                min = a[i];
                mini = i;
            }
            //largest number
            if(max<a[i]){
                max = a[i];
                maxi = i;
            }
        }
        System.out.println("largest number = "+max);
        System.out.println("largest number index = "+maxi);
        System.out.println("smallest number = "+min);
        System.out.println("smallest number index = "+mini);
    }
}
