/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id ba08447b-0bb7-4b80-ab22-863fdc001d4f
 * @name ContinuousSubArray
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

package Arrays;

/**
 *
 * @author ASUS
 */
public class ContinuousSubArray {
    public static void main(String[] args)
    {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(arr,arr.length));
        System.out.println(dynamic_programming_maxSubArray(arr,arr.length));
    }

    public static int maxSubArray(int[] arr, int n) //Kdane's Algorithm
    {
        int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
        for(int i=0;i<n;i++)
        {
            max_ending_here=max_ending_here+arr[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here; 
            }
            if(max_ending_here<0)
            {
                max_ending_here=0;
            }
            System.out.println();
        }
        return max_so_far;        
    }    

    private static int dynamic_programming_maxSubArray(int[] arr, int length) //Dynamic Programming
    {
        int max_so_far=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<length;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}