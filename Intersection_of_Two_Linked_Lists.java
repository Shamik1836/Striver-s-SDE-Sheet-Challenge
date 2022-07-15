
import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Intersection_of_Two_Linked_Lists {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		if (firstHead==null || secondHead==null) return 0;
        LinkedListNode<Integer> a=firstHead;
        LinkedListNode<Integer> b=secondHead;
        while (a != b){
            a=a==null? secondHead:a.next;
            b=b==null? firstHead:b.next;
        }
        if (a==null){
            return -1;
        }else{
            return a.data;
        }
	}
}