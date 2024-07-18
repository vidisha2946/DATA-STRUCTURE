import java.util.*;
public class Swap_Numbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("Before:");
        System.out.println("Number 1: "+a);
        System.out.println("Number 2: "+b);
        System.out.println("After:");
        swap(a,b);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Number 1: "+a);
        System.out.println("Number 2: "+b);

    }
}