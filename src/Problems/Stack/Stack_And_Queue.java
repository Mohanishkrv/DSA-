/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id de46a0d2-4739-4863-8923-3fe57550406c
 * @name Stack And Queue
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

package Stack;

import java.io.*;
import java.util.*;

/**
 *
 * @author Mohanish
 */
public class Stack_And_Queue {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s1[0]);
        int k=Integer.parseInt(s1[1]);
        Stack<Integer> stk=new Stack();
        Queue<Integer> q=new LinkedList();
        String s[]=br.readLine().split(" ");
        for(int i=n-1;i>=0;i--)
        {
            stk.push(Integer.parseInt(s[i]));
            q.add(Integer.parseInt(s[i]));
        }
        int res=0;
        int p=0;
        for(int i=0;i<k;i++)
        {
            if(stk.peek()>=q.peek())
            {
                res+=stk.pop();
            }
            else
            {
                p=i;
                break;
            }
        }
        for(int i=p;i<k;i++)
        {
            if(p==(k-1))
            {
                break;
            }
            else
            {
                res+=q.poll();
            }
        }
        System.out.println(res);
    }
}
