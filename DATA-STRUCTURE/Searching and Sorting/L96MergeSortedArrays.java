import java.util.Scanner;

public class L96MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //size of the first array
        System.out.print("Enter the size of the first sorted array: ");
        int low = scanner.nextInt();
        int[] arr1 = new int[low];

        //elements of the first array
        System.out.println("Enter elements of the first sorted array: ");
        for (int i = 0; i < low; i++) {
            arr1[i] = scanner.nextInt();
        }

        //size of the second array
        System.out.print("Enter the size of the second sorted array: ");
        int mid = scanner.nextInt();
        int[] arr2 = new int[mid];

        //elements of the second array
        System.out.println("Enter elements of the second sorted array: ");
        for (int i = 0; i < mid; i++) {
            arr2[i] = scanner.nextInt();
        }

        int high = low + mid;

        // Merge the two sorted arrays
        int[] mergedArray = mergeArrays(arr1, arr2, low, mid, high);

        // Display
        System.out.println("Merged sorted array: ");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    //merge two sorted arrays using low, mid, and high
    public static int[] mergeArrays(int[] arr1, int[] arr2, int low, int mid, int high) {
        int[] mergedArray = new int[high];

        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < low && j < mid) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < low) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < mid) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}
