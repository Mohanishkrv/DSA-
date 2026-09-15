/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 421908a2-015e-4d56-b001-9d1813187ee6
 * @name BST Insert untill negative
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

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class BST_Insert_untill_negative {
    class Node
    {
        int data;
        Node right,left;
        Node(int d)
        {
            data=d;
            right=left=null;
        }
    }
    Node root;
    
    public void inorder()
    {
        inorderRec(root);
    }
    
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    
    public void ins(int data)
    {
        root=insert(root,data);
    }
    
    public Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        if(data>=root.data)
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    public static void main(String[] args) throws Exception
    {
        BST_Insert_untill_negative tree=new BST_Insert_untill_negative();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int n=Integer.parseInt(br.readLine());
            if(n<0)
            {
                break;
            }
            tree.ins(n);
        }
        tree.inorder();
    }
}
