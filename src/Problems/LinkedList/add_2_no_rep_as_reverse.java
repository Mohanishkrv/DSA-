/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 3058569b-fb92-4655-bf5b-b138bef77d7f
 * @name add 2 no rep as reverse
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
public class add_2_no_rep_as_reverse {
    //l1[2,4,3]-->No is 342
    //l2[5,6,4]-->No is 465
    //l=[7,0,8]==No is 807
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {   
            this.data=data;
            this.next=null;
        }
        Node()
        {
            this.data=data;
        }
    }
    Node head=null;

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
    public void traverse(Node curr) 
    {
        while(curr!=null)
        {
            System.out.print(curr.data+"--> ");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public Node addLLNo(Node h1,Node h2)
    {
       Node dummy=new Node();
       Node temp=dummy;
       int carry=0;
       while(h1!=null || h2!=null || carry==1)
       {
           int sum=0;
           if(h1!=null)
           {
               sum+=h1.data;
               h1=h1.next;
           }
           if(h2!=null)
           {
               sum+=h2.data;
               h2=h2.next;
           }
           sum+=carry;
           carry=sum/10;
           Node n=new Node(sum%10);
           temp.next=n;
           temp=temp.next;
       }
       return dummy.next;
    }
    
    
    public static void  main(String[] args)
    {
        add_2_no_rep_as_reverse l1=new add_2_no_rep_as_reverse();
        add_2_no_rep_as_reverse l2=new add_2_no_rep_as_reverse();
        add_2_no_rep_as_reverse l3=new add_2_no_rep_as_reverse();
        l1.alNode(2);
        l1.alNode(4);
        l1.alNode(3);
        l1.traverse(l1.head);
        l2.alNode(5);
        l2.alNode(6);
        l2.alNode(4);
        l2.traverse(l2.head);
        l3.head=l3.addLLNo(l1.head,l2.head);
        l3.traverse(l3.head);
        
    }
}
