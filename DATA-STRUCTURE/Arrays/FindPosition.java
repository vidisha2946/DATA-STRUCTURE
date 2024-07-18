import java.util.Scanner;
public class FindPosition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int minPos = 0;
        int maxPos = 0;
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minPos = i;
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxPos = i;
            }
        }

        System.out.println("The smallest number is at position: " + (minPos + 1));
        System.out.println("The largest number is at position: " + (maxPos + 1));

    }
}