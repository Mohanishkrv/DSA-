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
 * @id 495fd2c0-e6fd-4876-a005-a053d4dc9573
 * @name AddOperations
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

package LinkedList  ;
public class AddOperations {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    
    public Node addatFront(int data, Node head)//    - - - head
    {
        //No need for empty ll case bcoz below code solves that problem autommatically
        Node n=new Node(data);
        n.next=head;
        head=n;
        return head;
    }
    
    public Node addatLast(int data, Node head)//   head - - -
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return head;
        }
        n.next=null;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
        return head;
    }
    
    Node addAtPos(Node head, int data, int index) 
    {
        if (index < 0) return head;
        if (index == 0) 
        {
            Node n = new Node(data);
            n.next = head;
            return n;
        }
        Node curr = head;

        for (int i = 0; i < index - 1; i++) 
        {
            if (curr == null) return head; // out of bounds
            curr = curr.next;
        }

        if (curr == null) return head;

        Node n = new Node(data);
        n.next = curr.next;
        curr.next = n;
        return head;
    }
    
    public void traverse()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.print("[");
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("]");
    }
    
    public static void main(String[]  args)
    {
        AddOperations l=new AddOperations();
        l.addatLast(22, null);
        l.addatLast(33, l.head);
        l.addAtPos(l.head,11, 2);
        l.addatLast(44, l.head);
        //l.addatFront(00);
        l.traverse();
        /*l.addatFront(-11,head);
        l.addatFront(-22,head);
        l.addatFront(-33,head);
        l.traverse();
        *///l.addatPos(11,4);//Indexing starts from 1
        //l.traverse();
        //l.deleteUsingKey(1);
        //l.traverse();
        //l.deleteatPos(1);
        //l.traverse();
    }
}
