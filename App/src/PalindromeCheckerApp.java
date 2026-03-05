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

interface PalindromeStrategy {
 boolean checkPalindrome(String input);
}

// Stack strategy
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

// Deque strategy
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

// Recursive strategy
class RecursiveStrategy implements PalindromeStrategy {
 @Override
 public boolean checkPalindrome(String input) {
  String normalized = input.replaceAll("\\s+", "").toLowerCase();
  return isPalindrome(normalized, 0, normalized.length() - 1);
 }

 private boolean isPalindrome(String s, int start, int end) {
  if (start >= end) return true;
  if (s.charAt(start) != s.charAt(end)) return false;
  return isPalindrome(s, start + 1, end - 1);
 }
}

// Context
class PalindromeContext {
 private PalindromeStrategy strategy;

 public PalindromeContext(PalindromeStrategy strategy) {
  this.strategy = strategy;
 }

 public boolean executeStrategy(String input) {
  return strategy.checkPalindrome(input);
 }
}

// Main class
public class PalindromePerformance {

 public static void main(String[] args) {

  String input = "A man a plan a canal Panama";

  PalindromeStrategy[] strategies = {
          new StackStrategy(),
          new DequeStrategy(),
          new RecursiveStrategy()
  };

  String[] names = {"Stack", "Deque", "Recursive"};

  for (int i = 0; i < strategies.length; i++) {
   PalindromeContext context = new PalindromeContext(strategies[i]);

   long startTime = System.nanoTime();
   boolean result = context.executeStrategy(input);
   long endTime = System.nanoTime();

   System.out.println(names[i] + " Strategy: " +
           (result ? "Palindrome" : "Not Palindrome") +
           " | Time: " + (endTime - startTime) + " ns");
  }
 }
}