/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 917168c6-2d98-4d25-b33d-4f442a508713
 * @name Basic Problem
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
 *Given an unsorted array of N elements and an element X.
 * The task is to write a recursive function to check whether
 * the element X is present in the given array or not. 
 * @author ASUS
 */
public class Basic_Problem {
   public static void main(String[] args)
   {
       int a[]={1,2,3,4,5,6,7};
       System.out.println(rec(0,a));
   }
   
   public static boolean rec(int i,int a[])
   {
       if(a[i]==5)
       {
           return true;
       }
       return rec(i+1,a);
   }
}
