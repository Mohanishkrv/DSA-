/*
 Linked List Operations
 Insertion	:
			Don't include if(head == null) {} because it wont let LL to add new node

			At Front [S , T] = [O(1) , O(1)]
			At Last  [S , T] = [O(1) , O(N)]
			After given Node [S ,T] = [O(1) , O(1)]
 Deletion	: 
 			At Given Pos[S , T] = [O(1) , O(K)]
			Given Node  [S , T] = [O(1) , O(1)]
 Traversing	: [ S , T] = [O(1) , O(1)]
 Searching	: [S , T] = [O(1) , O(K)]
 */

/**
 * @metadata-start
 * @id 6b08b0c4-8d6b-4a97-888b-4f21e70ce4b6
 * @name Operations LL
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

package LinkedList;

public class Operations_LL {
	class Node
	{
		int value;
		Node next;
		Node (int data)
		{
			this.value = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void  addAtFront(int value) //adding at starting of LL and making it new head
	{
		Node n = new Node(value);
		n.next = head;
		head = n;
	}

	public void addAtLast(int value)
	{
		Node n = new Node(value);
		if(head == null)
		{
			head = n;
			return;
		}
		Node curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next = n;
	}
	

	public void insertAfterGivenNode(int value, Node prev_Node)
	{
		Node n = new Node(value);
		if(prev_Node == null)
		{
			System.out.println("Given Node can not be null");
			return;
		}
		n.next = prev_Node.next;
		prev_Node.next = n;
	}

	public void search(int x)
	{
		Node curr = head;
		int pos =0;
		while(curr.value != x)
		{
			curr = curr.next;
			pos++;
		}
		if(curr.value == x)
		{
			System.out.println("Found at" + pos );
		}
		else
		{
			System.out.println("Not Found");
		}
	}

	public boolean recSearch(Node head ,int x)
	{
		if(head == null)
			return false;
		if(head.value == x)
			return true;
		return recSearch(head.next,x);	
	}
	
	public void deleteAtPos(int pos)
	{
		if(head == null)
		{
			return;
		}
		Node curr = head;

		if(pos == 0)
		{
			head = head.next;
			return;
		}

		for(int i = 0 ; curr.next != null && i < pos-1 ; i++)
		{
			curr = curr.next;
		}

		Node next = curr.next.next;
		curr.next = next;

	}

	public void deleteGivenNode(Node toBeDeleted)
	{
		if(toBeDeleted == null)
			return;
		toBeDeleted.value = toBeDeleted.next.value;
		toBeDeleted.next = toBeDeleted.next.next;
		return;
	}

	public void traverse()
	{
		Node curr = head;
		if(head == null)
		{
			System.out.println("Empty LL");
			return;
		}
		while(curr != null)
		{
			System.out.print(curr.value+" ");
			curr = curr.next;
		}
	}
	

	public static void main(String[] args) {
		Operations_LL l = new Operations_LL();
		l.addAtFront(0);
		l.addAtFront(1);
		l.addAtFront(2);
		l.addAtLast(1);
		l.addAtLast(2);
		l.addAtLast(3);
		// l.insertAfterGivenNode(0,l.head.next.next.next.next);
		//l.search(33);
		System.out.println(l.recSearch(l.head,1));
		//l.deleteAtPos(3);
		l.traverse();
	}

}

