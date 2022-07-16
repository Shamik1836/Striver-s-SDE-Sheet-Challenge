
import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/
public class Copy_LinkedList_With_Next_And_Random_Pointer{
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
        if (head==null) return null;
        Map<LinkedListNode,LinkedListNode> map=new HashMap<>();
        LinkedListNode<Integer> curr=head;
        while (curr != null){
            map.put(curr,new LinkedListNode<Integer>(curr.data));
            curr=curr.next;
        }
        for (LinkedListNode key:map.keySet()){
            LinkedListNode<Integer> newNode=map.get(key);
            newNode.next=map.get(key.next);
            newNode.random=map.get(key.random);
        }
        return map.get(head);
	}
}
