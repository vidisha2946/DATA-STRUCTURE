import java.util.*;
public class DelatationA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array of element: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array before deletation: ");
        for (int i = 0; i < size; i++) { 
            System.out.print(a[i] + ",");
        }
        System.out.println("enter position when you delete: ");
        int pos = sc.nextInt();
        int[] b = new int[size - 1];

        // before position
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        for (int i = pos; i < size - 1; i++) {
            b[i] = a[i + 1];
        }
        System.out.print("array after deletation: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(b[i] + ",");
        }
    }
}