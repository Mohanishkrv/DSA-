/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 856c22a8-36f7-4045-9bc3-11fbfa172cbd
 * @name Find intersection of 2 LL
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
public class Find_intersection_of_2_LL {
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
    
    public Node addNode(Node head,int data)
    {
        Node curr=head;
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return head;
        }
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
        n.next=null;
        return head;
    }
    
    public void traverse(Node curr)
    {
        while(curr!=null)
        {
            System.out.println(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    public Node intersection(Node head1, Node head2) 
    {
        while(head2!=null)
        {
            Node curr=head1;
            {
                while(curr!=null)
                {
                    if(curr==head2)
                    {
                        return head2;
                    }
                    curr=curr.next;
                }
                head2=head2.next;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Find_intersection_of_2_LL l=new Find_intersection_of_2_LL();
        head=l.addNode(head, 1);
        head=l.addNode(head, 3);
        head=l.addNode(head, 1);
        head=l.addNode(head, 2);
        head=l.addNode(head, 4);
        Node head1=head;
        head=head.next.next.next;
        Node headSec=null;
        headSec=l.addNode(headSec,3);
        Node head2=headSec;
        headSec.next=head;
        l.traverse(head1);
        l.traverse(head2);
        
        Node result=l.intersection(head1,head2);
        if(result==null)
            System.out.println("No Intersections");
        else
            System.out.println("Intersection at"+result.data);
    }
}
