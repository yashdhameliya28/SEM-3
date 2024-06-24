import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        System.out.println(3.14*r*r);
    }
}
