/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 33e8c840-fe60-4b49-8800-a15a8ecf6204
 * @name Stack push pop
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *You are given a stack of N integers. In one operation, you can either pop an element 
 * from the stack or push any popped element into the stack. You need to maximize the 
 * top element of the stack after performing exactly K operations. If the stack becomes 
 * empty after performing K operations and there is no other way for the stack to be 
 * non-empty, print -1
 * 
 * @author Mohanish
 */
public class Stack_push_pop {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s11[]=s1.split(" ");
        int n=Integer.parseInt(s11[0]);
        int k=Integer.parseInt(s11[1]);
        String s2=br.readLine();
        String s22[]=s2.split(" ");
        Stack stk=new Stack();
        for(int i=n-1;i>=0;i--)
        {
            stk.push(s22[i]);
        }
        String r ="";
        while(k>1)
        {
            if(stk.isEmpty())
            {
                System.out.println("-1");
                break;
            }
            r=(String) stk.pop();
            k--;
        }
        stk.push(r);
        System.out.print(stk.peek());
    }   
}
