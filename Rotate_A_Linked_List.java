
import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Rotate_A_Linked_List {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if (head==null||k==0||head.next==null) return head;
        Node curr=head;
        int len=1;
        while (curr.next != null){
            len++;
            curr=curr.next;
        }
        curr.next=head;
        k=len-k%len;
        while (k-- > 0) curr=curr.next;
        head=curr.next;
        curr.next=null;
        return head;
    }
}