
import java.util.*;
public class InsertA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of digits of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n + 1];
        System.out.println("enter the value of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to insert");
        int num = sc.nextInt();
        System.out.println("enter the index where the number is to be inserted");
        int index = sc.nextInt();
        int j = 0;
        for (int i = 0; i <= n; i++) {
            if (i == index) {
                temp[i] = num;
                continue;
            // } else if {
            //     temp[i] = arr[i-1];
            //     j++;
            // }
            } else {
                temp[i] = arr[j];
                j++;
            }
        }
        System.out.print("final array is:");
        for (int k = 0; k <=n; k++) {
            System.out.println("arr[" + k + "]=" + temp[k]);
        }
    }
}



// System.out.println("enter position when you delete: ");
// int pos = sc.nextInt();
// for (int i = pos; i < size; i++) {
//     a[i] = a[i + 1];
// }
// size--;

