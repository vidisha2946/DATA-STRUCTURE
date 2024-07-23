import java.util.Scanner;
import java.util.Stack;
public class EvaluationPostfix {
    public static int postreveal(String postfix) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char temp = postfix.charAt(i);
            if (Character.isDigit(temp)) {
                s.push(Integer.parseInt(String.valueOf(temp)));
            } else {
                int op2 = s.pop();
                int op1 = s.pop();
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
                }
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String postfix = scanner.nextLine();
        int result = postreveal(postfix);
        System.out.println("Postfix Evaluation: " + result);

    }
}
