import java.util.*;
public class OddEven
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i=2;
        if(n%i==0)
        {
            System.out.println("number is even");    
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}