/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 875fc5db-2ab8-4964-ad91-0c3d8cdcff0d
 * @name Merge 2 sorted LL
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

/**
 *
 * @author ASUS
 */
public class Merge_2_sorted_LL {

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
    }
    public static void print(Node curr)
    {
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public static Node recMerge(Node h1,Node h2)  //O(n)--O(n)
    {
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1.data<h2.data)
        {
            h1.next=recMerge(h1.next,h2);
            return h1;
        }
        else
        {
            h2.next=recMerge(h1, h2.next);
            return h2;
        }
    }
    
    public static void main(String[] args)
    {
        Merge_2_sorted_LL l1=new Merge_2_sorted_LL();
        Merge_2_sorted_LL l2=new Merge_2_sorted_LL();
        l1.addNode(1);
        l1.addNode(3);
        l1.addNode(5);
        print(l1.head);
        l2.addNode(2);
        l2.addNode(4);
        l2.addNode(6);
        print(l2.head);
        //Node h=l1.merge(l1.head,l2.head);
        Node Merged=recMerge(l1.head,l2.head);
        print(Merged);
    }
}
