/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 816d0893-c712-41da-9a73-dc500d9420e7
 * @name Detect cycle in LL
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

import java.util.HashSet;

/**
 *
 * @author ASUS
 */
public class Detect_cycle_in_LL {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
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
    
    public void traverse()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public void createCycle(Node head,int x,int y)//Creating cycle b/w corresponding X & Y containing Nodes
    {
        Node h1=head,h2=head;
        while(h1.data!=x || h2.data!=y)
        {
            if(h1.data!=x)
            {
                h1=h1.next;
            }
            if(h2.data!=y)
            {
                h2=h2.next;
            }
        }
        h2.next=h1;
    }
    
    public boolean detectCycleUsingHashSet(Node head) //O(n)--O(n)
    {
        Node curr=head;
        HashSet<Integer> h=new HashSet();
        while(curr!=null)
        {
            if(h.contains(curr.data))
            {
                return true;
            }
            h.add(curr.data);
            curr=curr.next;
        }
        return false;
    }
    
    public boolean detectCycle()
    {
        if(head==null)
            return false;
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)//if fast equlas to slow there is a cycle
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Detect_cycle_in_LL l=new Detect_cycle_in_LL();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        //l.createCycle(l.head,3, 5);
        //l.traverse();
        if(l.detectCycleUsingHashSet(l.head)==true)
        {
            System.out.println("Has Cycle");
        }
        else
        {
            System.out.println("No Cycle");
        }
    }
}
