/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id c7854a41-b2ce-41f8-a46c-7359776f1dfc
 * @name Understanding Rec2
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

package Recursion;

/**
 *
 * @author ASUS
 */
public class Understanding_Rec2 {
    
    public static int rec(int x)
    {
        if(x<5)
        {
            System.out.println("-->Smaller than 5");
            rec(x+1);
            System.out.println("<--After recursion inside x<5");
            return x;
        }
        else if(x<7)
        {
            System.out.println("-->Smaller than 7");
            rec(x+1);
            System.out.println("<--After recursion inside x<7");
        }
        System.out.println("<--No Condition Statement");
        return x;
    }
    
    public static void main(String[] args)
    {
        int x=1;
        rec(x);
        System.out.print(x+"Inside main");
    }
}
