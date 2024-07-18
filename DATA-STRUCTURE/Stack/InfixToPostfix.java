import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

class Postfix {
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
        stack.push('(');

        for (int i = 0; i < s.length(); i++) {

            char next = s.charAt(i);

            // if(stack.size() < 1)
            // {
            // System.out.println("Invalid String 1");
            // }

            while (G(stack.peek()) > F(next)) {
                char temp = stack.pop();
                polish = polish + temp;
                rank = rank + R(temp);
                if (rank < 1) {

                    System.out.println("Invalid String 2");

                }

            }
            if (G(stack.peek()) != F(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }
        }
        if (!stack.isEmpty() || rank != 1) {
            System.out.println("Invalid String 3");

        } else {
            System.out.println(polish);

        }

    }
}

public class InfixToPostfix {
    public static void main(String[] args) throws EmptyStackException {
        Scanner sc = new Scanner(System.in);
        Postfix p = new Postfix();
        System.out.print("Enter a INFIX string:  ");
        String infix = sc.nextLine();
        System.out.print("Postfix Expression is: ");
        p.convert(infix);
    }
}