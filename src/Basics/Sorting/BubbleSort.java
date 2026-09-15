/*
Bubble Sort         : Repeatedly sorts the element in wrong Order
Space Complextiy    : O(N^2)
Time Complexity     : O(1)

Worst Case Analysis : When array is arranged in decreasing order 
Total number of swaps = Total number of comparison
Total number of comparison (Worst case) = n(n-1)/2
Total number of swaps (Worst case) = n(n-1)/2

Best Case Analysis   : When array is sorted 	Ω(N)
*/
/**
 * @id f05103ae-c399-4091-8f85-bc6e9e917e20
 * @name BubbleSort
 * @description Basic sorting algorithm which repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
 *
 * @topic Sorting
 * @type Algorithm
 * @difficulty Easy
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
 * @time-complexity O(1)
 * @space-complexity O(N^2)
 *
 * @limitations
 * @edge-cases
 */

package Sorting;

import java.util.Arrays;

class BubbleSort
{
    public static void main(String[] args) 
    {
        int arr[]={21,312,1,31,1112,3,981,1212};
        
        sort(arr); 
        sortOptimized(arr);
    }

    //Below implementation runs O(N^2) even when the arrray is sorted
    
    private static void sort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {   
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Above implementation can be optimized by
    //stopping the algo if the inner loop didn't cause any swap
    private static void sortOptimized(int[] arr) 
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            Boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {   
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}