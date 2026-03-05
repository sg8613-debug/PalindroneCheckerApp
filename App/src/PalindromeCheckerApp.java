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
class Node {
 char data;
 Node next;

 Node(char data) {
  this.data = data;
  this.next = null;
 }
}

public class LinkedListPalindrome {

 // Convert string to linked list
 public static Node createLinkedList(String str) {
  Node head = null, tail = null;

  for (char c : str.toCharArray()) {
   Node newNode = new Node(c);

   if (head == null) {
    head = tail = newNode;
   } else {
    tail.next = newNode;
    tail = newNode;
   }
  }

  return head;
 }

 // Reverse a linked list
 public static Node reverse(Node head) {
  Node prev = null;
  Node current = head;

  while (current != null) {
   Node next = current.next;
   current.next = prev;
   prev = current;
   current = next;
  }

  return prev;
 }

 // Check palindrome
 public static boolean isPalindrome(Node head) {
  if (head == null || head.next == null)
   return true;

  Node slow = head;
  Node fast = head;

  // Find middle of list
  while (fast != null && fast.next != null) {
   slow = slow.next;
   fast = fast.next.next;
  }

  // Reverse second half
  Node secondHalf = reverse(slow);
  Node firstHalf = head;

  // Compare halves
  while (secondHalf != null) {
   if (firstHalf.data != secondHalf.data) {
    return false;
   }
   firstHalf = firstHalf.next;
   secondHalf = secondHalf.next;
  }

  return true;
 }

 public static void main(String[] args) {
  String input = "racecar";

  Node head = createLinkedList(input);

  if (isPalindrome(head)) {
   System.out.println("The string is a Palindrome.");
  } else {
   System.out.println("The string is NOT a Palindrome.");
  }
 }
}