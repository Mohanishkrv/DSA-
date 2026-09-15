/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 5f5d4c60-0f7f-4cc3-a1d6-60abc0953f3e
 * @name BT Iterative Traversals
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

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class BT_Iterative_Traversals {
    static class Node
    {
        int data;
        Node left,right;
        public Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    Node root;
    public void levelOrderTraversal()
            
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();//removes front element and removes it
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        System.out.println();
    }
    
    public void preOrderTraversal()
    {
        Stack<Node> stk=new Stack<Node>();
        stk.push(root);
        while(!stk.isEmpty())
        {
            Node temp=stk.peek();
            System.out.print(temp.data+" ");
            stk.pop();
            if(temp.right!=null)
            {
                stk.push(temp.right);
            }
            if(temp.left!=null)
            {
                stk.push(temp.left);
            }
        }
        System.out.println();
    }
    
    public void inOrderTraversal() 
    {
        if(root==null)
        {
            return;
        }
        Stack<Node> stk=new Stack<Node>();
        Node temp=root;
        while(temp!=null || stk.size()>0)
        {
            while(temp!=null)
            {
                stk.push(temp);
                temp=temp.left;
            }
            temp=stk.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
        System.out.println();
    }
    
    public void postOrderTraversal()
    {
        Stack<Node> stk1=new Stack<Node>();
        Stack<Node> stk2=new Stack<Node>();
        stk1.push(root);
        if(root==null)
        {
            return;
        }
        while(!stk1.isEmpty())
        {
            Node temp=stk1.pop();
            stk2.push(temp);
            if (temp.left != null) 
                stk1.push(temp.left); 
            if (temp.right != null) 
                stk1.push(temp.right);
        }
        while(!stk2.isEmpty())
        {
            Node temp=stk2.pop();
            System.out.print(temp.data+" ");
        }
    }
    
    public static void main(String[] args)
    {
        BT_Iterative_Traversals bt=new BT_Iterative_Traversals();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        System.out.println("Level Order Traversal");
        bt.levelOrderTraversal();
        System.out.println("Pre-Order Traversal[LDR]"); //DLR
        bt.preOrderTraversal();
        bt.levelOrderTraversal();
        System.out.println("In-Order Traversal[LDR]"); //DLR
        bt.inOrderTraversal();
        System.out.println("Post-Order Traversal[LDR]"); //DLR
        bt.postOrderTraversal();
    }
}
