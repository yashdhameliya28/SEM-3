import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("not vowel");
        }
    }
}
