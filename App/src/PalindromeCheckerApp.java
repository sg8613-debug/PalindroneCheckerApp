/**
 * ========================================================================
 * MAIN CLASS - usecase4PalindromeApp
 * ========================================================================
 *
 * use case 4: reversed string based palindrome check
 *
 * description :
 * this class validates a palindrome by converting
 * the string into the character array and compairing
 * characters using the two pointer technique
 *
 * at this stage , the application:
 * converts sting into the array
 * uses start snd end pointers
 * compares characters efficiently
 * displays the validation string
 *
 * this reduces extra memory usage
 *
 *
 *
 * @author - shourya
 * @version 4.0
 */





public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Step 1: Convert string to character array
        char[] characters = word.toCharArray();

        // Step 2: Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            // Step 3: Compare start and end characters
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}