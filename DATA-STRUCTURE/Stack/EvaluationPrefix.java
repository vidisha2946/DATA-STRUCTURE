import java.util.Scanner;
import java.util.Stack;

public class EvaluationPrefix {

    public static int evaluatePrefix(String prefix) {
        Stack<Integer> s = new Stack<>();

        // Process the expression from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char temp = prefix.charAt(i);

            if (Character.isDigit(temp)) {
                s.push(Integer.parseInt(String.valueOf(temp)));
            } else {
                int op1 = s.pop();
                int op2 = s.pop();
                switch (temp) {
                    case '+':
                        s.push(op1 + op2);
                        break;
                    case '-':
                        s.push(op1 - op2);
                        break;
                    case '*':
                        s.push(op1 * op2);
                        break;
                    case '/':
                        s.push(op1 / op2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + temp);
                }
            }
        }

        return s.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a prefix expression: ");
        String prefix = scanner.nextLine();
        int result = evaluatePrefix(prefix);
        System.out.println("Prefix Evaluation: " + result);
    }
}
