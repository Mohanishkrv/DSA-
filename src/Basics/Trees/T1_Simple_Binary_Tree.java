/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 40dcafdc-cb10-47a8-86bf-931690cb625d
 * @name T1 Simple Binary Tree
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

package Tree;

/**
 *
 * @author ASUS
 */
public class T1_Simple_Binary_Tree {

    static class Node
    {
        int data;
        Node left,right;
        Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    Node root;
    
    private void in(Node n)
    {
        in(n.left);
        System.out.print(n.data);
        in(n.right);
    }
    
    private void inorder() 
    {
        in(root);
    }
    
    public static void main(String[] args)
    {
        T1_Simple_Binary_Tree t=new T1_Simple_Binary_Tree();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.left.right=new Node(5);
        t.root.left.left=new Node(4);
        t.root.right=new Node(3);
        t.root.right.left=new Node(6);
        t.root.right.right=new Node(7);
        t.inorder();
    }
}
