/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id b6fd1161-0279-46dc-a841-c67c14ef7fc5
 * @name Get min at pop
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
public class Get_min_at_pop {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            Stack<Integer> stk=new Stack();
            for(int i=0;i<n;i++)
            {
                stk.push(Integer.parseInt(s[i]));
            }
            pop_min(stk);
            System.out.println();
        }
    }

    public  static void pop_min(Stack<Integer> stk) 
    {
        while(!stk.isEmpty())
        {
            System.out.print(get_min(stk)+" ");
            stk.pop();
        }
    }

    private static int get_min(Stack<Integer> stk) 
    {
        Stack<Integer> stk2=new Stack();
        int min=stk.peek();
        while(!stk.isEmpty())
        {
            int x=stk.pop();
            stk2.push(x);
            min=Math.min(min,x);
        }
        while(!stk2.isEmpty())
        {
            stk.push(stk2.pop());
        }
        return min;
    }
}
