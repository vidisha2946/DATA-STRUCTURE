import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of factorial: ");
        int n = sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of"+" "+n+": "+f);
        
    }
}