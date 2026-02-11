
import java.util.Scanner;
import java.util.Stack;

public class ProblemSolvingTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Expression: ");
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("The Expression is Balanced");
        } else {
            System.out.println("The Expression is not Balanced");
        }

        sc.close();
    }

    public static boolean isBalanced(String expression) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char c = expression.charAt(i);

            // If opening bracket then we will push
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);


            } // If closing bracket
            else if (c == ')' || c == '}' || c == ']') {

                // If stack empty then not balanced
                if (stk.isEmpty()) {
                    return false;
                }

                char top = stk.peek();

                // Checking for matched pair
                if ((c == ')' && top == '(')
                        || (c == '}' && top == '{')
                        || (c == ']' && top == '[')) {

                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        // If stack empty then balanced
        return stk.isEmpty();
    }
}
