/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 61686ce6-fad2-4d4a-a275-43ce85b93b62
 * @name Array Reversal
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

import java.time.format.ResolverStyle;

/**
 *
 * @author ASUS
 */
public class Array_Reversal {
    public static void main(String[] args)
    {
        int arr[]={1,3,23,323,4,5,6,7,2,34};
        reverseArr(arr);
    }

    public static void reverseArr(int[] arr) 
    {
        int temp;
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        print(arr);
    }

    private static void print(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
