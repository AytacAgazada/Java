import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        // Create a stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if it is an opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push it onto the stack
            } else {
                // If it's a closing bracket, check for matching opening bracket
                if (stack.isEmpty()) {
                    return false; // Stack is empty but there's a closing bracket
                }
                char top = stack.pop(); // Get the top of the stack
                if (!matches(top, c)) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if the opening and closing brackets match
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Main function to test the validity of parentheses
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "({[]})";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
        System.out.println(isValid(test4)); // false
        System.out.println(isValid(test5)); // true
    }
}