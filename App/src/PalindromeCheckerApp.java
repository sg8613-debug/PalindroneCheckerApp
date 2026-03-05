/**
 UC5-Stack-BasedPalindrome
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7 : Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author shourya
 * @version 5.0
=======
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
 * @version 7.0
 main
 */
class RecursivePalindromeChecker {

 // Recursive function
 public static boolean isPalindrome(String str, int start, int end) {

  // Base condition
  if (start >= end) {
   return true;
  }

  // If characters don't match
  if (str.charAt(start) != str.charAt(end)) {
   return false;
  }

  // Recursive call
  return isPalindrome(str, start + 1, end - 1);
 }

 public static void main(String[] args) {

  String input = "racecar";

  if (isPalindrome(input, 0, input.length() - 1)) {
   System.out.println("The string is a Palindrome");
  } else {
   System.out.println("The string is NOT a Palindrome");
  }
 }
}