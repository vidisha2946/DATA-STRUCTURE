import java.util.Scanner;

public class L97QuickSort {

    public static void quickSort(int arr[], int lb, int ub) {
        boolean flag = true;

        if (lb < ub) {

            int i = lb, j = ub + 1, key = arr[lb];

            while (flag) {
                i++;
                while (arr[i] < key && i > lb) {
                    i++;
                }
                j--;

                while (arr[j] > key && j < ub) {
                    j--;
                }

                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    flag = false;
                }
            }
            int temp1 = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp1;

            quickSort(arr, lb, j - 1);
            quickSort(arr, j + 1, ub);
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);
        display(arr);
        sc.close();
    }
}