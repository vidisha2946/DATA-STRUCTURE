import java.util.Scanner;
public class AverageOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double average = (double) sum / n;
        System.out.println("The average of the first " + n + " numbers is: " + average);
    }
}