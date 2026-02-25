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

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

 public static void main(String[] args) {

  // Original string
  String word = "level";

  // Create Deque (Double Ended Queue)
  Deque<Character> deque = new ArrayDeque<>();

  // Step 1: Insert characters into deque
  for (int i = 0; i < word.length(); i++) {
   deque.addLast(word.charAt(i));
  }

  boolean isPalindrome = true;

  // Step 2: Remove first and last, then compare
  while (deque.size() > 1) {

   char front = deque.removeFirst();  // From beginning
   char rear = deque.removeLast();    // From end

   if (front != rear) {
    isPalindrome = false;
    break;
   }
  }

  // Step 3: Display result
  if (isPalindrome) {
   System.out.println("The word \"" + word + "\" is a Palindrome.");
  } else {
   System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
  }
 }
}