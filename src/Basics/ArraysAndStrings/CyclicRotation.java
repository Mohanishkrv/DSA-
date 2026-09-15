/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 0b3077be-905b-45f6-a56b-2e632124f194
 * @name CyclicRotation
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

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CyclicRotation {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};//5 6 7 1 2 3 4 // 4 5 6 7 1 2 3
        rotate(arr,3);//rotation by 3
        print(arr);
    }
    
    public static void reverse(int arr[],int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    //clockwise
    public static void rotate(int[] arr, int k) 
    {
        //k=arr.length-k;// for anticlockwise
         reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    
    public static void print(int[] arr) {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}
