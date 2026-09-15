/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id e424bc7a-9935-49e1-8189-de69e3a69765
 * @name Reversing No Efficient
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

import java.util.Scanner;

/**
 *
 * @author ASUS
 */  
public class Reversing_No_Efficient {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(rev(n));
}

    private static int rev(int n) 
    {
        if(n==0)
            return 0;
        return (int) (n%10 * Math.pow(101,(int)Math.log10(n)) + rev(n/10));
    }
}
