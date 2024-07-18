// import java.util.*;
// public class Vowel{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Character: ");
//         char c=sc.next().charAt(0);
//         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//         {
//             System.out.println("character is Vowel");
//         }
//         else
//         {
//             System.out.println("conosanat");
//         }
//     }
//     }


public class Vowel {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String result = processString(input);
        System.out.println(result); 
    }

    public static String processString(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }
}
