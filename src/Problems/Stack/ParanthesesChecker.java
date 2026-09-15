/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 417bff2a-c575-49d2-8330-5b53afec4734
 * @name ParanthesesChecker
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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *Given an expression string exp. Examine whether the pairs and
 * the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 
* 'not balanced' for exp = “[(])”
 * 
 * @author Mohanish
 */
public class ParanthesesChecker {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            Stack stk=new Stack();
            String s=br.readLine();
            if(check(stk,s))
            {
                System.out.println("balanced");
            }
            else
            {
                System.out.println("imbalanced");
            } 
            t--;
        }
    }

    private static boolean check(Stack stk, String s) 
    {
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='(' || a=='{' || a=='[')
            {
                stk.push(a);
            }
            if (a =='}' || a ==')' || a==']') 
            { 
                if (stk.isEmpty()) 
                { 
                   return false; 
                }  
                else if ( !isMatchingPair((char) stk.pop(),a)) 
                { 
                   return false; 
                } 
            } 
        }
        if (stk.isEmpty())
        {     
            return true;
        }
        else
        {   
             return false; 
        }
    }

    private static boolean isMatchingPair(char c1, char c2)
    {
        if (c1 == '(' && c2== ')') 
            return true; 
        else if (c1== '{' && c2== '}') 
            return true; 
        else if (c1== '[' && c2== ']') 
            return true; 
        else
            return false; 
    }
    
}
