
import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/
public class Reverse_Nodes_in_groups_of_size_k{
    public static Node reverseKElements(Node head,int n,int[] b,int i){
        if (head==null || i>=n) return head;
        int k=b[i];
        if (k == 0) {
            return reverseKElements(head, n, b, i + 1);
        }

        Node cur = head, prev = null, ahead = null;
        int cnt = 0;

        
        while (cur != null && cnt < k) {
            ahead = cur.next;
            cnt++;
            cur.next = prev;
            prev = cur;
            cur = ahead;
        }


        head.next = reverseKElements(ahead, n, b, i + 1);
        return prev;
    }
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
        if (head==null) return head;
        head = reverseKElements(head, n, b, 0);
        return head;
        
	}
}