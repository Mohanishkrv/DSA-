/**
 * @metadata-start
 * @id c68363cf-359e-4910-92e0-3b832dd23810
 * @name Length LL
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

package	LinkedList;


public class Length_LL
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	// public void addElement(int value)  //adding at starting of LL and making it new head
	// {
	// 	Node n = new Node(value);
	// 	n.next = head;
	// 	head = n;
	// }

	public void addAtLast(int value) // adding at the end of LL and not making it new head
	{
		Node n = new Node(value);
		if(head == null)
		{
			// n.next = null;
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

	public void findLength()
	{
		int c = 0;
		Node curr = head;
		while(curr != null)
		{
			curr = curr.next;
			c++;
		}
		System.out.println("Length is : "+c);
	}
	
	public static int countNodesRecursive(Node head) 
	{
        // Base Case
       	if (head == null) 
		{
            return 0;
        }
		// Count this node plus the rest of the list
        return 1 + countNodesRecursive(head.next);
    }

	public static void main(String[] args) {
		Length_LL l = new Length_LL();
		// l.addElement(1);
		// l.addElement(2);
		l.addAtLast(1);
		l.addAtLast(2);
		l.addAtLast(3);
		l.findLength();
	}
}