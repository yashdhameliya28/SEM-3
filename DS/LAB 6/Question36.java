import java.util.Scanner;
public class Question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature type to convert");
        String type = sc.next();
        System.out.println("Enter temperature");
        double temperature = sc.nextDouble();
        if(type == "celsius"){
            celsiusToFahrenhit(temperature);
        }
        else{
            fahrenhitToCelsius(temperature);
        }

    }
    public static void celsiusToFahrenhit(double c){
        System.out.println("Fahrenhit is "+((9*c)/5)+32);
    }
    public static void fahrenhitToCelsius(double f){
        double c =((5*f)/9)-32;
        System.out.println("Celsius is "+c);
    }
}

