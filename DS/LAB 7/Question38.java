import java.util.Scanner;

public class Question38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int length = sc.nextInt();
        Stack st = new Stack(length);
        sc.close();
    }
}

class Stack {
    int[] array;
    int top, length;

    Stack(int length) {
        this.length = length;
        array = new int[length];
        top = -1;
    }

    public void push(int data) {
        if (top >= length - 1) {
            System.out.println("stack underflow");
        } else {
            top++;
            array[top] = data;
        }
    }

    public void pop() {
        if (top <= 0) {
            System.out.println("stack underflow");
        } else {
            top--;
            array[top + 1] = 0;
        }
    }

    public void change(int i, int data) {
        if (top - i + 1 <= 0) {
            System.out.println("stack underflow");
        } else {
            array[top - i + 1] = data;
        }
    }

    public int peep(int i) {
        if (top - i + 1 <= 0) {
            System.out.println("stack underflow");
            return -1;
        } else {
            return array[top - i + 1];
        }
    }
}