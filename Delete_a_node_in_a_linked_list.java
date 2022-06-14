import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Delete_a_node_in_a_linked_list {
    public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        LinkedListNode<Integer> temp=(node==null) ? node:node.next;
        node.data=temp.data;
        node.next=(temp==null)?null:temp.next;
        temp=null;
	}
}
