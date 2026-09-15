/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id 042c8fd8-4b32-4dce-a4fc-207784a55f0e
 * @name RemoveDuplicateSortedArray
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

import java.util.HashSet;

/**
 *
 * @author MOHANISH
 */
public class RemoveDuplicateSortedArray {//in SOrted Array
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5,5,5,6,7,7,7,8,9,9,10};
        removeDup(arr);//O(n) O(n)
    }

    public static void removDup(int arr[])
    {
        
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        //arr[j++]=arr[arr.length-1];
        //System.out.println(arr.toString());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    private static void removeDup(int[] arr) 
    {
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(list.add(arr[i])==false)
            {
                continue;
            }
        }
        System.out.println(list.toString());
    }
}
