/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id aae32cbe-de07-43ad-ac4b-ca9b2d8a522c
 * @name NegativesToOneSide
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

package Array_Problems;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class NegativesToOneSide {
    public static void main(String args[])
    {
        int arr[] = { 12 ,11, -13, -5, 6 ,-7 ,5 ,-3, -6};
        int n = arr.length;
        System.out.print(Arrays.toString(rearrangeNegative(arr, n)));
    }

    private static int[] rearrangeNegative(int[] arr, int n) 
    {
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0 && i!=x)
            {
                swap(arr,x,i);
                x++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr,int x, int y) 
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
//20, -12, -6, -9, 5, 2, 1, 7, 6, 9
//-20 -12 -6 -9 5 7 6 2 1 9