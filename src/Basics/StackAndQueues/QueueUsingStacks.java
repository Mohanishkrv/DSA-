/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 156d03e0-7121-47e0-872b-1e592327b622
 * @name QueueUsingStacks
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

package Stack_and_Queue;

import java.util.Stack;

/**
 *
 * @author MOHANISH
 */
public class QueueUsingStacks {
    Stack<Integer> stk1=new Stack<>();
    Stack<Integer> stk2=new Stack<>();
    
    void enqueue(int x)
    {
        //Main Stack is stk1
        //stk1 to stk2
        while(!stk1.isEmpty())
        {
            stk2.push(stk1.pop());
        }
        
        stk1.push(x);
        //stk2 to stk1
        while(!stk2.isEmpty())
        {
            stk1.push(stk2.pop());
        }
    }
    
    int dequeue()
    {
        while(stk1.isEmpty())
        {
            System.out.println("Empty Queue");
        }
        
        int x=stk1.pop();
        return x;
    }
    
    public static void main(String[] args) {
        QueueUsingStacks q=new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        
    }
}
