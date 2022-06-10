import java.util.* ;
import java.io.*; 
	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}


public class Reverse_Linked_List {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode<Integer> dummy=null;
        while (head != null){
           LinkedListNode<Integer> next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }
        return dummy;
    }
}
