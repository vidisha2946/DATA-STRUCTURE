import java.util.Stack;
import java.util.Scanner;

class Prefix {
    public int G(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        } else if (c == '^') {
            return 5;
        } else if (c == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    public int F(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '^') {
            return 6;
        } else if (c == '(') {
            return 9;
        } else if (c == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    public String reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                reverse += '(';
            } else if (s.charAt(i) == '(') {
                reverse += ')';
            } else {
                reverse += s.charAt(i);
            }
        }
        return reverse;
    }

    int R(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return -1;
        } else {
            return 1;
        }
    }

    public void convert(String s) {
        s = s + ')';
        Stack<Character> stack = new Stack<>();
        String polish = "";
        int rank = 0;
        String rev_infix = reverse(s);
        stack.push('(');
        for (int i = 0; i < rev_infix.length(); i++) {
            char next = rev_infix.charAt(i);
            if (stack.size() < 1) {
                System.out.println("Invalid String");
            }
            while (G(stack.peek()) > F(next)) {
                char temp = stack.pop();
                polish = polish + temp;
                rank = rank + R(temp);
                if (rank < 1) {
                    System.out.println("Invalid String");

                }
            }
            if (G(stack.peek()) != F(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }

        }
        if (rank != 1) {
            System.out.println("Invalid String");

        } else {
            System.out.println(reverse(polish));
        }
    }
}
public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prefix p = new Prefix();
        System.out.println("Enter a INFIX string (and add extra closing bracket after enter a Expression): ");
        String infix = sc.nextLine();
        System.out.println("Reverse of Infix is: " + p.reverse(infix));
        System.out.print("Prefix Expression is: ");
        p.convert(infix);
    }
}