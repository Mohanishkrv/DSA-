/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 3bde91e4-f65d-482e-8331-fe1851abaabe
 * @name MakingBST
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
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mohanish
 */
public class MakingBST {

    class Node
{
    int data;
    Node right;
    Node left;
    
    Node(int data)
    {
        this.data=data;
        right=left=null;
    }
}
Node root;   
 
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String s11[]=s.split(" ");
        MakingBST B=new MakingBST();
        for(int i=0;i<s11.length;i++)
        {
            B.insert(Integer.parseInt(s11[i]));
        }
        B.rinorder();
    }
    
    public void insert(int data)
    {
        root=recinsert(root,data);
    }
    
    public Node recinsert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.data>data)
        {
            root.left=recinsert(root.left,data);
        }
        if(root.data<data)
        {
            root.right=recinsert(root.right,data);
        }
        return root;
    }
    
    public void rinorder()
    {
        inorderRec(root);
    }
    
    public void inorderRec(Node root) 
    { 
        if (root != null)
        { 
            inorderRec(root.left); 
            System.out.print(root.data+" "); 
            inorderRec(root.right); 
        } 
    }
}
