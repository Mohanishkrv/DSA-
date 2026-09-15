    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id a396e394-9891-4057-84b4-ee9dfe9b6d22
 * @name Reverse LL
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

/**
 *
 * @author ASUS
 */
public class Reverse_LL {
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
    static Node head=null;
    
    public void alNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }
    public void traverse() 
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        while(curr!=null)
        {
            System.out.print(curr.data+"--> ");
            curr=curr.next;
        }
    }
    
    public void reverseLL() //O(n) - O(1)
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            //Link Breaker
            Node next=curr.next;
            curr.next=prev;
            //Assigner
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    
    public static Node reverseRec(Node head)
    {
        if(head==null || head.next==null)  // base case, head.next is used when only one element is there bcoz we can access the next of single element also
            return head;
        Node newHead=reverseRec(head.next);
        head.next.next=head;// 2->3         2.next ie 3==2
        head.next=null;
        return newHead;
    }
    
    public static void reversePrint(Node n)
    {
        if(n.next==null)
        {
            head=n;
            return;
        }
        reversePrint(n.next);
        System.out.print(n.data);
    }
    
    public static void main(String[] args)
    {
        Reverse_LL l=new Reverse_LL();
        l.alNode(1);
        l.alNode(2);
        l.alNode(3);
        l.alNode(4);
        l.alNode(5);
        l.traverse();
        l.reverseLL(); //O(n) O(1)
        //head=reverseRec(head);
        //reversePrint(head);
        l.traverse();
    }
}
