/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 667285b3-84dc-4ce6-b363-79502b9252f6
 * @name Reverse LL in group of K
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

package LinkedList_Problems;

/**
 *
 * @author ASUS
 */
pending
public class Reverse_LL_in_group_of_K {
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
        n.next=null;
    }
    
    public void traverse(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public int lengthOfLL()
    {
        int len=0;
        Node curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        return len;
    }
    public Node reverseGroupK(Node head,int k)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        int length=lengthOfLL();
        Node dummyHead=new Node(0);//creating a new head node
        dummyHead.next=head;
        Node prev=dummyHead;
        Node curr,next;
        while(length>=k)
        {
            curr=prev.next;
            next=curr.next;
            for(int i=0;i<k;i++)
            {
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev= curr;
            length-=k;
        }
        return dummyHead.next;
    }
    
    public static void main(String[] args)
    {
        Reverse_LL_in_group_of_K l=new Reverse_LL_in_group_of_K();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        l.addNode(6);
        l.addNode(7);
        l.addNode(8);
        l.traverse(l.head);
        Node n=l.reverseGroupK(l.head,3);
        l.traverse(l.head);
    }
}
