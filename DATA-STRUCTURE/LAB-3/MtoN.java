import java.util.Scanner;
public class MtoN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start value (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the end value (n): ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from " + m + " to " + n + " is: " + sum);
    }
}