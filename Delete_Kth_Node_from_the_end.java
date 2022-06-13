import java.util.* ;
import java.io.*; 
// ***************************************************************
	
// 	Following is the structure of the Singly Linked List.
	
// 	class LinkedListNode<T> {
//     	T data;
//     	LinkedListNode<T> next;

//     	public LinkedListNode(T data) {
//         	this.data = data;
//     	}
// 	}

// ***************************************************************
public class Delete_Kth_Node_from_the_end {
    public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
        if (head==null || K==0) return head;
        LinkedListNode<Integer> fast=head;
        LinkedListNode<Integer> slow=head;
        for (int i=0;i<K;i++){
            if (fast.next == null) {
                LinkedListNode<Integer> next = head.next;
                head.next = null;
                head = next;
                return head;
            }else{
                fast=fast.next;
            }
        }
        while (fast.next != null)
        {
            slow=slow.next;
            fast=fast.next;
            
        }
        slow.next=slow.next.next;
        return head;
	}
}
