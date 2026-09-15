/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id ad5535c7-47f9-4fcf-9d58-35e55f49e93c
 * @name Jump Search
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
import java.util.Arrays;

/**
 *
 * @author ASUS
 */


/*
 Find jump value using sqrt(size_of_array)
*/
public class Jump_Search {
public static void main(String [] args) throws Exception 
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().split(" ");
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=Integer.parseInt(s[i]);
    }
    Arrays.sort(a);
    int x=Integer.parseInt(br.readLine());
    int f=jumpSearch(a,x,n);
    if(f==-1)
    {
        System.out.print("Not Found");
    }
    else
    {
        System.out.print(a[f]+" found at location "+(f+1));
    }
} 
mm
    private static int jumpSearch(int[] arr, int x,int n) 
    {
        int jump=(int)Math.floor(Math.sqrt(n));
        int prev=0;
        while(arr[Math.min(jump,n)-1]<x)
        {
            prev=jump;
            jump+=(int)Math.floor(Math.sqrt(n));
            if(prev>=n)
                return -1;
        }
        
        while (arr[prev] < x) 
        { 
            prev++; 
            if (prev == Math.min(jump, n)) 
                return -1; 
        }
        if (arr[prev] == x) 
            return prev;   
        return -1; 
    }
}
