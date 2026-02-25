/**
 UC5-Stack-BasedPalindrome
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6 : Queue + Stack Based Palindrome Check
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
 * @version 4.0
 main
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

 public static void main(String[] args) {

  // Original string
  String word = "radar";

  // Create Stack (LIFO)
  Stack<Character> stack = new Stack<>();

  // Create Queue (FIFO)
  Queue<Character> queue = new LinkedList<>();

  // Step 1: Enqueue characters and Push into stack
  for (int i = 0; i < word.length(); i++) {
   char ch = word.charAt(i);
   stack.push(ch);      // LIFO
   queue.add(ch);       // FIFO
  }

  boolean isPalindrome = true;

  // Step 2: Compare dequeue vs pop
  while (!stack.isEmpty()) {

   char fromStack = stack.pop();     // Reverse order
   char fromQueue = queue.remove();  // Original order

   if (fromStack != fromQueue) {
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