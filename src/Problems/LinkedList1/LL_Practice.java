/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id d74a5783-f22d-4695-8b65-7aa02dd63528
 * @name LL Practice
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
public class LL_Practice {
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
    
    public void addatFront(int data)//    - - - head
    {
        //No need for empty ll case bcoz below code solves that problem autommatically
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    
    public void addatLast(int data)//   head - - -
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;//last refers to the element at the last
        }
        last.next=n;
    }
    
    public void addatPos(int data,int index)
    {
        Node n=new Node(data);
        if(index==0 || head==null)
        {
            head=n;
            return;
        }
        Node curr=head;
        while(index-1!=0)
        {
            curr=curr.next;
            index--;
        }
        n.next=curr.next;
        curr.next=n;
    }
    
    public void deleteUsingKey(int data)
    {
        if(head==null)
        {
            System.out.print("Empty Linked List");
            return;
        }
        Node curr=head;   
        Node prev=null;
        while(curr.data!=data)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }
    
    public void deleteatPos(int index)
    {
        if(index<0 || head==null)
        {
            System.out.print("invalid");
            return;
        }
        Node curr=head;
        Node prev=null;
        while(index!=0)
        {
            prev=curr;
            curr=curr.next;
            index--;
        }
        prev.next=curr.next;
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
        LL_Practice l=new LL_Practice();
        l.addatLast(2);
        l.addatLast(3);
        l.addatLast(4);
        l.addatFront(0);
        l.traverse();
        l.addatFront(-1);
        l.addatFront(-2);
        l.addatFront(-3);
        l.traverse();
        l.addatPos(1,4);
        l.traverse();
        l.deleteUsingKey(1);
        l.traverse();
        l.deleteatPos(1);
        l.traverse();
    }
}
