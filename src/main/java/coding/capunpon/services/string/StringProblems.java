package coding.capunpon.services.string;

public class StringProblems {

    public static void main(String[] args) {
//        System.out.println(Palindrome.isPalindrome());
        System.out.println(PalindromeCheckerService.isPalindrome("AsaakaAsa"));
        String input = "Testing";
        System.out.println(input + " in reverse is " + StringReverseService.reverse(input));

        System.out.println(OccurrenceCounterService.getOccurrence("ss", "ss SS trt asd C ss9ss"));
    }
}
