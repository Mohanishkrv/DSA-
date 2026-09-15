/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id ec4965cd-f4ad-4216-9d7a-fa9b85c52e22
 * @name The Max Number
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

package Bit_Manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class The_Max_Number {
    
    
    private static void check(int[] a, int n, int i) 
    {
        for(int j=0;j<n;j++)
        {
            
        }
    }
    
    public static int no_bits(int no)
    {
        return (int)(Math.log(no) / Math.log(2) + 1);
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s1[]=br.readLine().split(" ");
            int n=Integer.parseInt(s1[0]);
            int i=Integer.parseInt(s1[1]);
            String s2[]=br.readLine().split(" ");
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=Integer.parseInt(s2[j]);
            }
            check(a,n,i);
            t--;
        }
        System.out.print(no_bits(t));
    }

    
}
