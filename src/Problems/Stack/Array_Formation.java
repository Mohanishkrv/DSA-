/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 7ce77d6b-8f87-47eb-83a7-c66b0c72382a
 * @name Array Formation
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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Array_Formation {
   
    public static void main(String[] args) throws Exception
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       String s[]=br.readLine().split(" ");
       Stack<Integer> stk=new Stack();
       Queue<Integer> q=new LinkedList();
       for(int i=s.length-1;i>=0;i--)
       {
          int a=Integer.parseInt(s[i]);
          if(prime(a)==1)
          {
              stk.push(a);
              //System.out.print(a+" ");
          }
          else
          {
              q.add(a);
          }          
       }
       while(stk.size()!=0)
       {
           System.out.print(stk.pop()+" ");
       }
       System.out.println();
       while(q.size()!=0)
       {
           System.out.print(q.poll()+" ");
       }
       
       
   }
   
   
   public static int prime(int a)
   {
       int c=0;
       for(int i=2;i<a/2;i++)
       {
           if(a%i==0)
           {
               c++;
           }
       }
       if(c==0)
       {
           return 1;
       }
       else
       {
           return 0;
       }
   }
}
