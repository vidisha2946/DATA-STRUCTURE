import java.util.*;

public class AnagramGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of word: ");
        int n = sc.nextInt();
        System.out.println("Enter the word: ");
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("word"+"["+i+"]"+"= ");
            str[i] = sc.next();
        }
        int ran = (int) (Math.random() * n);
        System.out.println("The randomly generated word is:"+str[ran]);
        System.out.print("enter angram word: ");
        String s = sc.next();
        // boolean isFound = false;
        char[] s_word = s.toCharArray();
        char[] str_word = str[ran].toCharArray();
        Arrays.sort(s_word);
        Arrays.sort(str_word);
        if(s_word.length != str_word.length){
            System.out.println("False");
            return;
        }
        else{
            for(int i = 0 ; i < s_word.length ; i++){
                if(s_word[i] != str_word[i]){
                    System.out.println("no anagram");
                    break;
                }
                else{
                    System.out.println("angram");
                    break;
                }
                
            }
        }
        // for (int i = 0; i < str[ran].length(); i++) {
        //     isFound = false;
        //     for (int j = 0; j < s.length(); j++) {
        //         if (str[ran].charAt(i) == s.charAt(j)) {
        //             isFound = true;
        //         }
        //     }
        //     if (!isFound) {
        //         break;
        //     }
        // }
        // if (isFound) {
        //     System.out.println("Anagram");
        // } else {
        //     System.out.println("Not an anagram");
        // }
    }
}