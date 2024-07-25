import java.util.Stack;
import java.util.Scanner;

public class Question47 {

    static Stack<Double> stack = new Stack<>();
    public static Double evaluatePostfix(String s) {
        String[] part = s.split(",");
        for(int i=0 ; i<part.length ; i++){
            part[i] = part[i].trim();
        }
        for (int i = 0; i <= s.length() - 1; i++) {
            String temp = part[i];
            if (Character.isDigit(temp.charAt(0))) {
                stack.push(Double.parseDouble(temp));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                operation(operand1 , operand2 , temp);
            }
        }
        return stack.pop();
    }

    public static void operation(double operand1 , double operand2 , String temp){
        switch (temp) {
            case "+":
                stack.push(operand1 + operand2);
                break;
            case "-":
                stack.push(operand1 - operand2);
                break;
            case "*":
                stack.push(operand1 * operand2);
                break;
            case "/":
                stack.push(operand1 / operand2);
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression");
        String s = sc.next();
        System.out.println(evaluatePostfix(s));
        sc.close();
    }
}
