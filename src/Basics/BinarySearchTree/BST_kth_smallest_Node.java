/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 96d9fdf0-bfd2-4c1c-88d7-b3d75c699403
 * @name BST kth smallest Node
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

package Binary_Search_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */


/*
We can find the kth smallest node using inorder traversal because it traverses the tree in ascending order TC=O(n) SC=O(n)
*/
public class BST_kth_smallest_Node {
    class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    Node root;
    
    public void ins(int data)
    {
        root=insert(root,data);
    }
    
    public Node insert(Node root,int data)
    {
        if(root==null)
        {
            return root;
        }
        else if(data<root.data)
        {
            insert(root.left,data);
        }
        else if(data>=root.data)
        {
            insert(root.right,data);
        }
        return root;
    }
    
    public Node k_smallest(Node root,int k)//using MORRIS Traversal using O(1) extra space
    {
        int count=0;
        Node curr=root;
        int ksmall=Integer.MIN_VALUE;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                count++;
                if(count==k)
                {
                    ksmall=curr.data;
                }
                curr=curr.right;
            }
            else
            {
                Node pre=curr.left;
                while(pre.right!=null && pre.right!=curr)
                {
                    pre=pre.right;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BST_kth_smallest_Node t=new BST_kth_smallest_Node();
        while(true)
        {
            int n=Integer.parseInt(br.readLine());
            if(n<1)
            {
                break;
            }
            t.ins(n);
        }
    }
}
