import java.util.Scanner;
class Insertion_Sort{
    int [] arr;
    public Insertion_Sort(int [] arr){
        this.arr=arr;
    }

    void sort(){
        int n=arr.length;
        int i=1;
        while(i<n){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;
        }
    }
}
public class L93InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array to be sorted:");
        int n = sc.nextInt();

        System.out.println("Enter the array values:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }

        Insertion_Sort is = new Insertion_Sort(arr);
        is.sort();

        // Print the Sorted Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]=" + arr[i] + " ");
        }
        System.out.println();
    }
}