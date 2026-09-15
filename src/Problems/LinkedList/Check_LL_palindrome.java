/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 563abc33-a896-4146-ad48-c558d6b66126
 * @name Check LL palindrome
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

package LinkedList_Problems;

/**
 *
 * @author ASUS
 */
public class Check_LL_palindrome {
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
    
    public void aNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=null;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    }
    
    public void traverse()
    {
        if(head==null)
        {
            return;
        }
        else
        {
            Node curr=head;
            while(curr!=null)
            {
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
        }
    }
    
    public void findMidEle(Node head)
    {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        reverse(slow);
    }
    
    public void reverse(Node head)
    {
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    
    public boolean checkPalindrome()
    {
        Complete
    }
}
