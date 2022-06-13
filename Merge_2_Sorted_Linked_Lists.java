import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/
public class Merge_2_Sorted_Linked_Lists {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if (first==null) return second;
        if (second==null) return first;
        if (first.data>second.data){
            LinkedListNode tmp= first;
            first=second;
            second=tmp;
        }
        LinkedListNode res=first;
        while (first != null && second != null){
            LinkedListNode temp=null;
            while (first != null && first.data<=second.data){
                temp=first;
                first=first.next;
            }
            temp.next=second;
            LinkedListNode temp1= first;
            first=second;
            second=temp1;
        }
        return res;
	}
}
