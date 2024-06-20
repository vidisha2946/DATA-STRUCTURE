import java.util.*;
public class Replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "]"+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("number u change in array: ");
        int a = sc.nextInt();
        System.out.println("changee a value number: ");
        int b = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                arr[i]=b;
            }
            System.out.print(arr[i] + ",");

        }
    }
}