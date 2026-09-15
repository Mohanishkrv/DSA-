/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 2c4070e0-65d3-480c-8d6c-1027fce51c1f
 * @name Missing no in series
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

package Searching_Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
/*
Given an array that represents elements of arithmetic progression in o One element 
is missing in the progression, find the missing number. 
The first and last element will not be the missing number.

Sample Input:
5
1 5 7 9 11

Sample Output:
3
*/
public class Missing_no_in_series {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        missing_no(a,n);
    }

    private static void missing_no(int[] a, int n) 
    {
        int l=0,h=n-1;
        int d=(a[n-1]+a[0])/n;//finding value of d using an=a+n*d formula ???
        while(l<h)
        {
            int m=l+(h-l)/2;
            if(l+1==h)
            {
                System.out.print((a[h]+a[l])/2);
                break;
            }
            if(a[m]==a[0]+m*d)
            {
                l=m;
            }
            else
            {
                h=m-1;
            }
        }
    }
}
