/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 48b678ad-0134-4861-aa10-3f7dbb096227
 * @name Traversal Input
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
 * Taking input in the form of Inorder from a String
 *
 * @author Mohanish
 */
public class Traversal_Input {
    public class Node
    {
        int data;
        Node right,left;
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
        
                
                
    }
    
}
