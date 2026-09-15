/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id ca7c4f81-aaaa-4830-b4c6-9d99ceed1a41
 * @name Seggregate 0 and 1s
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

package Searching_Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
/*
Write a program to segregate 0s and 1s. You are given an array of 
0s and 1s in random order. Segregate 0s on the 
left side and 1s on the right side of the array.

*/
public class Seggregate_0_and_1s {
      public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        segregate(a, n);
        
        //System.out.print(Arrays.toString(a));
    }  
mm
    private static void segregate(int[] arr, int n) 
    {
        int type0 = 0; 
        int type1 = n-1; 
          
        while (type0 < type1) { 
            if (arr[type0] == 1) { 
                // swap 
                arr[type1] = arr[type1]+ arr[type0]; 
                arr[type0] = arr[type1]-arr[type0]; 
                arr[type1] = arr[type1]-arr[type0]; 
                type1--; 
            } else { 
                type0++; 
            } 
        } 
    }
    
   /* public static void segm2(int a[],int n)
    {
        int l=0,r=a.length-1;
        while(l<r)
        {
            while(a[l]==0)
            {
                l++;
            }
            while(a[r]==1)
            {
                r--;
            }
            a[l]=0;
            a[r]=1;
            l++;
            r--;
        }
        
        System.out.print(Arrays.toString(a));
    }*/
}
