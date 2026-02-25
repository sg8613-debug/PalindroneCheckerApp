/**
 * ========================================================================
 * MAIN CLASS - usecase3PalindromeApp
 * ========================================================================
 *
 * use case 3: reversed string based palindrome check
 *
 * description :
 * this class checks whether the string is palindrome
 * by reversing string and compairing with it with
 * th original value
 *
 * at this stage , the application:
 * iterated the string in reverse order
 * builds a reverse string
 * compares original and reverse string
 * displays the validation string
 *
 * this introduces transformation based validation
 *
 *
 *
 * @author - shourya
 * @version 3.0
 */






public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Step 1: Reverse string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Step 2: Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

    }
}