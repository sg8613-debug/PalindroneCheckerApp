/**
 * ========================================================================
 * MAIN CLASS - usecase2PalindromeApp
 * ========================================================================
 *
 * use case 2: hardcoded palindrome checker app
 *
 * description :
 * this class demonstrates the basic palindrome validation
 * using a hardcoded string value
 *
 * at this stage , the application:
 * stores a predfined string
 * compares characters from both strings
 * determine whether the string is palindrome
 * display the result of the console
 *
 * this usecase introduces the fundamental comparison logic
 * before using advance data structures
 *
 *
 * @author - shourya
 * @version 2.0
 */






public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

    }
}