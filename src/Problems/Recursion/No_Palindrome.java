/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 967e7c84-9c08-4386-81a3-bd46165f7b7d
 * @name No Palindrome
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
 * @author Mohanish
 */
public class No_Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(recpali(n));
        System.out.println(pali(n));
    }
    
    
    /*
    private static String pali(int n) 
    {
        int res=0;
        int r=n;
        while(n>0)
        {
            int a=n%10;
            res=res*10+a;
            n=n/10;
        }
        if(res==r)
        {
            return "PALINDROME";
        }
        else
        {
            return "NOT-PALINDROME";
        }
    }*/
    //Using Recursion
    private static String recpali(int n) 
    {
        int res=0;
        int r=n;
        if(r==res)
        {
            return "PALINDROME";
        }
        int a=n%10;
        res=res*10+a;
        n=n/10;
        return recpali(n);
    }
    
}
