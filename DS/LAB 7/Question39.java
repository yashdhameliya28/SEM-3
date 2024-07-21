 import java.util.Stack;

public class Question39 {
    
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        
        // Push the first half of the string onto the stack
        for (int i = 0; i < len / 2; i++) {
            stack.push(s.charAt(i));
        }
        
        // Determine the starting point of the second half
        int start = (len % 2 == 0) ? len / 2 : len / 2 + 1;
        
        // Compare the second half of the string with the stack
        for (int i = start; i < len; i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        
        // If stack is empty and no mismatches, it's a palindrome
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String[] testStrings = {"aca", "bcb", "abcba", "abbcbba"};
        
        for (String s : testStrings) {
            System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
        }
    }
}
 
    