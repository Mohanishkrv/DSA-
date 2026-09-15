/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 9d71582b-7f80-4438-b02e-6b4e0058dada
 * @name LargestSumContiguousArray KdaneAlgorithm
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

package Array_Problems;

/**
 *
 * @author MOHANISH
 */
public class LargestSumContiguousArray_KdaneAlgorithm {
    public static void main(String[] args) 
    {
        int[] arr = {-2, -3, -1};
        getMaxSubArray(arr);
    } 

    private static void getMaxSubArray(int[] arr) 
    {
        int maxSum=Integer.MIN_VALUE;
        int maxEndHere=0;
        for(int i=0;i<arr.length;i++)
        {
            maxEndHere+=arr[i];
            if(maxSum<maxEndHere)
            {
                maxSum=maxEndHere;
            }
            if(maxEndHere<0)
            {
                maxEndHere=0;
            }
        }
        System.out.println(maxSum);
    }
}
