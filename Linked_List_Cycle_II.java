import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Linked_List_Cycle_II
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        if (head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node entry=head;
        while (fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                while (slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}