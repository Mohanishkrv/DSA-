/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 1053bfdd-2b15-4150-97cc-7245d528406c
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
  * @metadata-end
 */

package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    Node head=null;
    Node tail=null;
    
    public void add_node(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
    }
    
    public void disp()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.print("Empty LL");
        }
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    
    public void r_disp()
    {
        Node curr=head;
        Node prevnode=null;
        Node nextNode;
        if(head==null)
        {
            System.out.print("Empty LL");
        }
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prevnode;
            prevnode=curr;
            curr=nextNode;
        }
        
            System.out.print(prevnode+" ");
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        Reverse_LL l=new Reverse_LL();
        for(int i=0;i<n;i++)
        {
            int a=Integer.parseInt(s[i]);
            l.add_node(a);
        }
        l.disp();
        l.r_disp();
    }
    
}
