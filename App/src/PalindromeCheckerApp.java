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
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy interface
interface PalindromeStrategy {
 boolean checkPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
 @Override
 public boolean checkPalindrome(String input) {
  String normalized = input.replaceAll("\\s+", "").toLowerCase();
  Stack<Character> stack = new Stack<>();
  for (char c : normalized.toCharArray()) stack.push(c);
  String reversed = "";
  while (!stack.isEmpty()) reversed += stack.pop();
  return normalized.equals(reversed);
 }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
 @Override
 public boolean checkPalindrome(String input) {
  String normalized = input.replaceAll("\\s+", "").toLowerCase();
  Deque<Character> deque = new ArrayDeque<>();
  for (char c : normalized.toCharArray()) deque.addLast(c);
  while (deque.size() > 1) {
   if (!deque.removeFirst().equals(deque.removeLast())) return false;
  }
  return true;
 }
}

// Context class
class PalindromeContext {
 private PalindromeStrategy strategy;

 public PalindromeContext(PalindromeStrategy strategy) {
  this.strategy = strategy;
 }

 public boolean executeStrategy(String input) {
  return strategy.checkPalindrome(input);
 }
}

// Main class to test
public class UC12_SingleFilePalindrome {

 public static void main(String[] args) {

  String input = "A man a plan a canal Panama";

  // Use Stack strategy
  PalindromeContext context = new PalindromeContext(new StackStrategy());
  System.out.println("Using Stack Strategy: " + (context.executeStrategy(input) ? "Palindrome" : "Not Palindrome"));

  // Use Deque strategy
  context = new PalindromeContext(new DequeStrategy());
  System.out.println("Using Deque Strategy: " + (context.executeStrategy(input) ? "Palindrome" : "Not Palindrome"));
 }
}