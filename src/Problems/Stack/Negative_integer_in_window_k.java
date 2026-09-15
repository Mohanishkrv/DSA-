/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 564af226-64b3-407d-902c-cfb2bb9cab64
 * @name Negative integer in window k
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

package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Given an array and a positive integer k, find the first negative integer 
 * for each and every window(contiguous subarray) of size k.

 * @author ASUS
 */
public class Negative_integer_in_window_k {
   public static void main(String[] args) throws Exception
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
           int n=Integer.parseInt(br.readLine());
           String s[]=br.readLine().split(" ");
           int k=Integer.parseInt(br.readLine());
           //int a[]=new int[k];
           int c;
           for(int i=0;i<n-k+1;i++)
           {
               int j=i;
               c=0;
               for(int r=0;r<k;r++)
               {
                   int val=Integer.parseInt(s[j]);
                   if(val<0)
                   {
                       System.out.print(val+" ");
                       c++;
                       break;
                   }
                   j++;
               }
               if(c==0)
               {
                   System.out.print(0+" ");
               }
           }
           System.out.println();
       }
   }
}
