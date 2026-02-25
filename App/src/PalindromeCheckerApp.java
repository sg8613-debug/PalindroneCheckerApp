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
