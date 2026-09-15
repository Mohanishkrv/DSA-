/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id fa729f76-b47b-4a20-bec6-89aba76efb20
 * @name Stack2 Stkcls
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

package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mohanish
 */
public class Stack2_Stkcls {
 
    public static void main(String[] args)
    {
        Stack stk=new Stack();
        //Stack2_Stkcls s=new Stack2_Stkcls();
        st_push(stk,22);//not using the object of class because every method is static
        st_push(stk,13);
        st_push(stk,522);
        st_push(stk,01);
        st_search(stk,13);
        st_pop(stk);
        st_peek(stk);
        st_pop(stk);
        st_empty(stk);
        st_peek(stk);
        st_pop(stk);
        st_pop(stk);
        st_empty(stk);
    }
    
    static void st_push(Stack stk,int a)//make object of Stack class so that u can access Stack's Method
    {
        stk.push(new Integer(a));
        System.out.println("push("+a+")");
        System.out.println("Stack:" +stk);
    }
    
    static void st_pop(Stack stk)
    {
      System.out.print("pop -> ");
       int a =(int) stk.pop();
      System.out.println(a);
      System.out.println("Stack: " + stk);
    }
    
    static void st_peek(Stack stk)
    {
        System.out.println("TOS is"+stk.peek());
    }
     
    static void st_search(Stack stk,int a)
    {
       int pos=stk.search(a);
       if(pos==-1)
       {
           System.out.println("Element not found");
       }
       else
       {
           System.out.println("Element found at "+pos);
       }
    }
    
    static boolean st_empty(Stack stk)
    {
        boolean se=stk.empty();
        System.out.println(""+se);
        return true;
    }
}
