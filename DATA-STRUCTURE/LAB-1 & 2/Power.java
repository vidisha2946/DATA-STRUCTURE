import java.util.*;

public class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the power");
        int p = sc.nextInt();
        int ans = 1;
        while (p != 0) 
        {
            ans *= n;
            p--;
        }
        System.out.println("ans is = " + ans);
    }
}