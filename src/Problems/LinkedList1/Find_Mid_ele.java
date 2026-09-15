/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 08b1eb52-8ea0-4ea2-ab8d-1854c89a57ed
 * @name Find Mid ele
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

import java.io.*;
import java.util.LinkedList;
/**
 *
 * @author Mohanish
 */
/*
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String s11[]=s.split(" ");
        LinkedList<Integer> l=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            l.add(Integer.parseInt(s11[i]));
        }
        System.out.print(l.get(n/2));       
    }  */  
public class Find_Mid_ele {

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void aNode(int data)
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
    
    private void disp(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String s11[]=s.split(" ");
        Find_Mid_ele l=new Find_Mid_ele();
        for(int i=0;i<n;i++)
        {
            l.aNode(Integer.parseInt(s11[i]));
        }
        l.disp(n/2);
    }
}
