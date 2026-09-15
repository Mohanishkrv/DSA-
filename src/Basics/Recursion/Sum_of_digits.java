/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id acb249c2-1ad7-466a-a836-b10d15f8431a
 * @name Sum of digits
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

package Recursion;

/**
 *
 * @author ASUS
 */
public class Sum_of_digits {
    public static void main(String[] args)
    {
        int n=12345;
        System.out.print(rec(n));
    }
    
    public static int rec(int n)
    {
        if(n<10)
        {
            return n;
        }
        else
        {
            return n%10 + rec(n/10);
        }
    }
}
