/**
 * @metadata-start
 * @id 5dfd1eb1-29a2-4e1a-a0b5-8a61cedaa48e
 * @name Creation LL
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

class Creation_LL
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
	Node head = new Node(0);
	public static void main(String[] args) {
		Creation_LL l = new Creation_LL();
		l.head.next = l.new Node(1);
		l.head.next.next = l.new Node(2);
		l.traverse();
	}

	private void traverse() {
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}

}