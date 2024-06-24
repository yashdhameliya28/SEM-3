import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter number to find factor"));
        int n = sc.nextInt();
        boolean prime = false;
        for(int i=2 ; i<n ; i++){
            if(n%i==0){
                prime = true;
            }
        }
        if(prime){
            System.out.println("Given number is not prime");
        }
        else{
            System.out.println("Given number is prime");
        }
    }
}
