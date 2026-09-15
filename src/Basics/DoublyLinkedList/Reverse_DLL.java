/**
 * @id 07ca5e2f-8794-4439-a653-febbe10ac76e
 * @name Reverse DLL
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

package DoublyLinkedList;

public class Reverse_DLL {
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head = null;
	
	public void insertAtEnd(int value)
	{
		Node n = new Node(value);
		n.next = null;
		if(head == null)
		{
			n.prev = null;
			head = n;
			return;
		}
		Node curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next = n;
		n.next = null;
		n.prev = curr;
	}

	public void traverse()
	{
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-");
			curr = curr.next;
		}
	}

	public void reverse()
	{
		Node temp = null;
		Node curr = head;
		while(curr != null)
		{
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}

		if(temp != null)
		{
			head = temp.prev;
		}
	}

	public static void main(String[] args) {
		Reverse_DLL l = new Reverse_DLL();
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(4);
		l.insertAtEnd(5);
		l.traverse();
		System.out.println();
		l.reverse();
		l.traverse();
	}
}
