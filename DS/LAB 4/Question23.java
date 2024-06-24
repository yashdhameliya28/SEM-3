import java.util.Scanner;
public  class Question23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int n = sc.nextInt();
        int[] first = new int[n];
        for(int i=0 ; i<n ; i++){
            first[i] = sc.nextInt();
        }
        int[] second = new int[n+1];
        System.out.println("Enter element value");
        int element = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            if(first[i]<element){
                second[i] = first[i];
            }
            else if (first[i]>element && second[i-1]<element) {
                second[i] = element;
            }
            else {
                second[i] = first[i-1];
            }
        }
        for(int i=0 ; i<second.length ; i++){
            System.out.println(+second[i]);
        }
    }
}