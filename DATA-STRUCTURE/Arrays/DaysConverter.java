import java.util.Scanner;
public class DaysConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;
        System.out.println(totalDays + " days are equivalent to:");
        System.out.println(years + " year(s)");
        System.out.println(weeks + " week(s)");
        System.out.println(days + " day(s)");
    }
}
