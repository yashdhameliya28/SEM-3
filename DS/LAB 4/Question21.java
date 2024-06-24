import java.util.Scanner;
public  class Question21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int n = sc.nextInt();
        int[] first = new int[n];
        for(int i=0 ; i<n ; i++){
            first[i] = sc.nextInt();
        }
        int[] second = new int[n+1];
        System.out.println("Enter location");
        int location = sc.nextInt();
        System.out.println("Enter location value");
        int element = sc.nextInt();
        for(int i=0 ; i<second.length ; i++){
            if(location>i){
                second[i] = first[i];
            }
            else if (location == i) {
                second[i] = element;
            }
            else if(location<i){
                second[i] = first[i-1];
            }
        }
        for(int i=0 ; i<second.length ; i++){
            System.out.print(+second[i]);
        }
    }
}