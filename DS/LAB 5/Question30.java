import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] first = new int[2][2];
        int[][] second = new int[2][2];
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.println("Enter value of element for first array");
                first[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.println("Enter value of element for second element");
                second[i][j] = sc.nextInt();
            }
        }
        int[][] third = new int[2][2];
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                third[i][j] = first[i][j] + second[i][j];
            }
        }
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print("third array "+third[i][j]+",");
            }
        }
    }
}