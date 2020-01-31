package coding.capunpon.services.string;

import java.util.Scanner;

public class PalindromeCheckerService {
    public static boolean isPalindrome(String s) {
        System.out.print("Palindrome[true/false]:" + s + "\n");
        return checkPal(s);
    }

    public static boolean isPalindrome() {
        Scanner s = new Scanner(System.in);
        System.out.print("Palindrome[true/false] - Enter string:");
        String input = s.nextLine();
        return checkPal(input);
    }

    private static boolean checkPal(String input) {
        char[] ch = input.toLowerCase().toCharArray();
        int chLen = ch.length;
        for ( int i = 0; i < chLen/2; i++ ) {
            if (ch[i] != ch[(chLen-1)-i]) {
                return false;
            }
        }
        return true;
    }
}
