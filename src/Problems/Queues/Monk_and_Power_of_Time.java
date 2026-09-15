/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id ab0892e7-b8c2-44c9-b202-245d90bd6f8b
 * @name Monk and Power of Time
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

package Queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mohanish
 */
public class Monk_and_Power_of_Time {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().trim().split(" ");
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            q.add(Integer.parseInt(s[i]));
        }
        String s2[]=br.readLine().trim().split(" ");
        Queue<Integer> q2=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            q2.add(Integer.parseInt(s2[i]));
        }
        check(n,q,q2);
        
    }

    private static void check(int n, Queue<Integer> q, Queue<Integer> q2) 
    {
        int c=0;
        while(true)
        {   if(q.peek()!=q2.peek())
            {
                int a=q.peek();
                q.remove();
                q.add(a);               
                c++;
            }
            if(q.peek()==q2.peek())
            {
                q.remove();
                q2.remove();
                c++;
            }
            if(q.isEmpty()  )
            {
                break;
            }
        }
        System.out.println(c);  
    }    
}
