/*
 * Reversing a Linked List(Iterative / Recursive)
 * [T,S] = [O(N),O(1)]
 */
/**
 * @id b0beb608-66e3-474c-8530-913e45bb0418
 * @name Reversal LL
 * @description
 *
 * @topic
 * @type Normal
 * @difficulty
 * @pattern
 *
 * @companies
 * @source
 * @url
 *
 * @status Unsolved
 * @approach
 * @attempts 0
 * @confidence Low
 * @review
 *
 * @time-complexity
 * @space-complexity
 *
 * @limitations
 * @edge-cases
 */

package LinkedList;

class Reversal_LL {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	static Node head;

	public void insert(int value)
	{
		Node n = new Node(value);
		n.next = head;
		head = n;
	}

	public void traverse()
	{
		if(head == null || head.next == null)
			return;
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+" <- ");
			curr = curr.next;
		}
	}

	// public void reverseLL()
	// {
	// 	Node next,prev = null;
	// 	Node curr = head;
	// 	while(curr != null) // traverse untill curr becomes null
	// 	{
	// 		next = curr.next;  //next is now pointed by new curr ptr
	// 		curr.next = prev; //current node ptr pointing towards prev
	// 		prev = curr; // new prev beacame curr
	// 		curr = next; // new curr became next
	// 	}
	// 	head = prev; // prev became new head
	// }

	public Node recursiveReverse(Node head)
	{	
		//head==null checks whether the LL is empty or not
		//head.next==null checks whether the LL has one element
		//In both case it will return null
		if(head == null || head.next == null) 
			return head;
		Node newHead = recursiveReverse(head.next);//recurse untill the last element and make it new head
		head.next.next = head;	// 2->3  = 3->2
		head.next = null;		// cut 2 to 3 connection
		return newHead;
	}
	public static void main(String[] args) {
		Reversal_LL l = new Reversal_LL();
		// l.insert(1);
		// l.insert(2);
		// l.insert(3);
		// l.insert(4);
		// l.insert(5);
		// l.head = new Node(1);
		// l.head.next = new Node(2);
		// l.head.next.next = new Node(3);		
		// l.head.next.next.next = new Node(4);
		// l.head.next.next.next.next = new Node(5);	
		l.traverse();
		l.head = l.recursiveReverse(head);
		//l.reverseLL();
		System.out.println();
		l.traverse();
	}
}