/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id e98bbf4c-9584-4807-9e28-7c390c35e642
 * @name Min Max
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

package Arrays;

/**
 *
 * @author ASUS
 */
public class Min_Max {
    public static void main(String[] args)
    {
        int arr[]={1,3,23,323,4,5,6,7,2,34};
        min(arr);
    }

    private static void min(int[] arr) 
    {
        int min,max=min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        print(min,max);
    }

    private static void print(int min, int max) 
    {
        System.out.print(min+" "+max);
    }
}
