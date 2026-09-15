/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 5e99327c-3ad7-42f7-9fae-e3674c118277
 * @name PostOrder frm InOrder PreOrder
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

import java.util.Arrays;

/**
 *
 * @author ASUS
 */ 
public class PostOrder_frm_InOrder_PreOrder {
    public static void main(String[] args)
    { 
        int in[] = { 4, 2, 5, 1, 3, 6 }; 
        int pre[] = { 1, 2, 4, 5, 3, 6 };
        int n=pre.length;
        printpostOrder(in,pre,n);
    }
    
    public static int search(int arr[],int x,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    
    static void printpostOrder(int in[],int pre[],int n)
    {
        int root=search(in,pre[0],n);
        if(root!=0)
        {
            printpostOrder(in,Arrays.copyOfRange(pre,1,n),root);
        }
        if(root!=n-1)
        {
            printpostOrder(Arrays.copyOfRange(in,root+1,n),Arrays.copyOfRange(pre,1+root,n),n-root-1);
        }
        System.out.print(pre[0]+" ");
    }
    
}
