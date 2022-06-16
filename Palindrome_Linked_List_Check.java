import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Palindrome_Linked_List_Check {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        if (head==null || head.next==null)
            return true;
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        LinkedListNode<Integer> prev = head;
        while (fast!= null && fast.next != null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        if (slow == null) {

            return true;
        }
        prev.next=null;
        LinkedListNode<Integer> reverseHead=reverseList(slow);
        
        while (head!= null){
            if (!head.data.equals(reverseHead.data))
                return false;
            reverseHead=reverseHead.next;
            head=head.next;
            
        }
        return true;
	}
    private static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head){
        LinkedListNode prev=null;
        LinkedListNode next=null;
        while (head != null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}