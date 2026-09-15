
/**
 * @id 195b249e-3cee-4625-8283-b7f2a1670420
 * @name DeleteOperations
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
public class DeleteOperations {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }

        Node() 
        {
            
        }
    }

    static Node head=null;
    public void addNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    } 

    public static void traverse()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public Node delFromEnd(int n) //O(n) O(1)
    {
        Node start=new Node();
        start.next=head;
        Node fast=start;
        Node slow=start;
        
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        //Since fast has traverse n times so it will start from there
        //while slow will start from starting of list 
        //and in that way slow will stop at length-k+1
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;//return head  
    }

    public void delAtPosition(int val) //O(n) O(1)
    {
        Node curr=head;
        Node prev=null;
        if(curr!=null && curr.data==val)//Corner case If head.data=val
        {
            head=curr.next;
            return;
        }
        while(curr.data!=val && curr!=null)//Base Case
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr==null)//Corner case: Key not present in LL
        {
            return;
        }
        prev.next=curr.next;
    }

    public void delGivenNode(Node n)//O(1) O(1)
    {
        if(n==null || n.next==null)
            return;
        n.data=n.next.data;
        n.next=n.next.next;
        return;
    }
    
    public static void main(String[] args)
    {
        DeleteOperations l=new DeleteOperations();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        l.traverse();
        l.delFromEnd(2);
        l.traverse();
    }
}
