/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id b970f22e-c75f-4594-a7e3-2c70e7b73d2f
 * @name Stk using Arrays
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

package Stack_and_Queue;

/**
 *
 * @author ASUS
 */
public class Stk_using_Arrays {
    int stk[]=new int[100];
    int top=-1;
    public void push(int data)
    {
        top++;
        stk[top]=data;
    }
    
    public int pop()
    {
        int data=stk[top];
        top--;
        return data;
    }/////////////////////////////////////////////////////palindrome
    
    public void peek()
    {
        System.out.println(stk[top]);
    }
    public static void main(String[] args)
    {
        Stk_using_Arrays stk=new Stk_using_Arrays();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.pop();
        stk.peek();
    }
}
