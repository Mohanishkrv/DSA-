/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id c625e1c8-03c9-42ad-9cbd-8fe5ec79048d
 * @name Binary Search1
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

package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Binary_Search {
public static void main(String[] args) throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s[]=br.readLine().split(" ");
    int a[]=new int[10];
    for(int i=0;i<a.length;i++)
    {
        a[i]=Integer.parseInt(s[i]);
    }
    int n=Integer.parseInt(br.readLine());
    System.out.print(binary_search(a,n)+1);
}

    private static int binary_search(int[] arr, int x) 
    {
        int l = 0, r = arr.length - 1; 
        while (l <= r) 
        { 
            int m = l + (r - l) / 2; 
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m;  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1;  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        // if we reach here, then element was 
        // not present 
        return -1; 
    }
}
