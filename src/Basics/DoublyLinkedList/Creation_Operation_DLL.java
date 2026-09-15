/*
 Insertion : 
 At Front
 At Given Node
 At End
 Before Given Node
 */

/**
 * @metadata-start
 * @id 33d6547d-02eb-42e2-b176-0ccc5790096e
 * @name Creation Operation DLL
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
  * @metadata-end
 */

package DoublyLinkedList;

public class Creation_Operation_DLL
{
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
	static Node head = null;

	public void insertAtFront(int value) // making a new head n-Head-------Tail
	{
		Node n = new Node(value);
		n.next = head;
		if(head != null)
		{
			head.prev = n;
		}
		
		head = n;
	}

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

	public void deleteAtPosition(int x)
	{
		if(x == 1)
		{
			head = head.next;
			head.prev = null;
		}
		else
		{
			Node curr = head;
			while(curr != null && x>1)
			{
				curr=curr.next;
				x--;
			}
			curr.prev.next = curr.next;
		}
	}

	public void traverse() 
	{
		if(head == null)
		{	
			System.out.print("Empty DLL");
			return;
		}
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+" <-> ");
			curr=curr.next;
		}

		
	}
	public static void main(String[] args) {
		Creation_Operation_DLL l = new Creation_Operation_DLL();
		// l.insertAtFront(1);
		// l.insertAtFront(2);
		// l.insertAtFront(3);
		// l.insertAtFront(4);
		// l.insertAtFront(5);
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(4);
		l.insertAtEnd(5);
		l.traverse();
		System.out.println();
		l.deleteAtPosition(5);
		l.traverse();
	}

}