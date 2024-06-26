import java.util.*;

public class CaseConverterC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        // String s = sc.nextLine();
        // String r="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);

                // if(s.charAt(i)>=65 && s.charAt(i)<=90){
                // r+=(char)(s.charAt(i)+32);
                // }

            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);

                // else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                // r+=(char)(s.charAt(i)-32);
                // }

            } else {
                result += c;
            }
        }
        System.out.println("Converted string: " + result);
    }
}
