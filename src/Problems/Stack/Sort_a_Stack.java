/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 12cdc51d-2772-46d0-be7b-2b9464b4770b
 * @name Sort a Stack
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
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Sort_a_Stack {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            Stack<Integer> stk=new Stack<Integer>();
            for(int i=0;i<n;i++)
            {
                stk.push(Integer.parseInt(s[i]));
            }
            //Stack<Integer> stk2=new Stack();
            //System.out.print(stack_sort(stk,stk2));           
            
            Stack2_sort(stk);
            System.out.print(stk);
        }
    }
    
    
    // Recursive Method to insert an item x in sorted way 
    static void sortedInsert(Stack<Integer> s, int x) 
    { 
        // Base case: Either stack is empty or newly inserted 
        // item is greater than top (more than all existing) 
        if (s.isEmpty() || x > s.peek()) 
        { 
            s.push(x); 
            return; 
        } 
       
        // If top is greater, remove the top item and recur 
        int temp = s.pop(); 
        sortedInsert(s, x); 
       
        // Put back the top item removed earlier 
        s.push(temp); 
    } 
       
    // Method to sort stack 
    static void Stack2_sort(Stack<Integer> s) 
    { 
        // If stack is not empty 
        if (!s.isEmpty()) 
        { 
            // Remove the top item 
            int x = s.pop(); 
       
            // Sort remaining stack 
            Stack2_sort(s); 
       
            // Push the top item back in sorted stack 
            sortedInsert(s, x); 
        } 
    }
    
    
    public static Stack<Integer> stack_sort(Stack<Integer> s1 , Stack<Integer> s2)
    {
        if(s1.size()==0 || s1.size()==1)
        {
            return s1;
        }
        int element = s1.pop();
        s1 = stack_sort(s1,s2);
        while(!s1.isEmpty())
        {
            if(element>s1.peek())
            {
                break;
            }
            else
            {
                s2.push(s1.pop());
            }
        }
        s1.push(element);
        while(!s2.isEmpty())
        {
            int el = s2.pop();
            s1.push(el);
        }
        return s1;
    }
}
